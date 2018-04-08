package com.james.ssm.controller;

import com.james.ssm.po.*;
import com.james.ssm.service.ItemsService;
import com.james.ssm.service.PersonService;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;

@Controller
public class PersonControll {

    @Autowired
    PersonService personService;


    @RequestMapping("/queryPersonList")
    public ModelAndView queryPersonList(PersonQueryVo personQueryVo){
        List<PersonCustom> persons=personService.queryPersonList(personQueryVo);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("personsList",persons);
        modelAndView.setViewName("person/Person_List");
        return  modelAndView;
    }
    @RequestMapping("addPerson")
    public ModelAndView addPerson(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("person/Person_add");
        return modelAndView;
    }
    @RequestMapping("savePerson")
    public ModelAndView savePerson(PersonQueryVo personQueryVo){
        PersonCustom personCustom=personQueryVo.getPersonCustom();
        personService.savePerson(personCustom);
        List<PersonCustom> persons=personService.queryPersonList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("personsList",persons);
        modelAndView.setViewName("person/Person_List");
        return modelAndView;
    }
    @RequestMapping("/findPersonById")
    public  ModelAndView  findItemsById(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        Integer id= Integer.valueOf(request.getParameter("id"));
        Person person=personService.findPersonById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("person",person);
        modelAndView.setViewName("person/Person_by_id");
        return  modelAndView;
    }
    @RequestMapping("updatePerson")
    public ModelAndView updatePerson(PersonCustom personCustom){
        personService.updatePerson(personCustom);
        List<PersonCustom> persons=personService.queryPersonList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("personsList",persons);
        modelAndView.setViewName("person/Person_List");
        return modelAndView;
    }
    @RequestMapping("deletePersonById")
    public ModelAndView deletePersonById(HttpServletRequest request){

        Integer id= Integer.valueOf(request.getParameter("id"));
        System.out.println("deletePersonById:"+id);
        personService.deletePersonById(id);
        List<PersonCustom> persons=personService.queryPersonList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("personsList",persons);
        modelAndView.setViewName("person/Person_List");
        return modelAndView;
    }

    @RequestMapping("importExcelPerson")
    public ModelAndView importExcelPerson() throws IOException {
        HSSFWorkbook hwb= new HSSFWorkbook(new FileInputStream(new File("D:\\readexcel\\backinterview2.xls")));
        HSSFSheet hssfSheet=null;
        DecimalFormat format=new DecimalFormat("#");
        int i=hwb.getSheetIndex("xtwl");
        hssfSheet=hwb.getSheetAt(i);
// 导入外委信息
// for(int j=0;j<hssfSheet.getLastRowNum();j++){
//            HSSFRow row=hssfSheet.getRow(j);
//            if(row != null) {
//                if (!row.getCell(6).toString().trim().equals("") && row.getCell(6) != null) {
//                    PersonCustom personCustom=new PersonCustom();
//                    personCustom.setPname(row.getCell(6).toString());
//                    personCustom.setPcomp(row.getCell(4).toString());
//                    personCustom.setProjectname(row.getCell(2).toString());
//                    personCustom.setPtype("外委");
//                    personCustom.setServicedep(row.getCell(1).toString());
//                    personCustom.setTeminalip(row.getCell(11).toString());
//                    personCustom.setOfficeaddress(row.getCell(12).toString());
//                    personService.savePerson(personCustom);
//                }
//
//            }
//        }
//倒入专责信息

        for(int j=0;j<hssfSheet.getLastRowNum();j++){
            HSSFRow row=hssfSheet.getRow(j);
            if(row != null) {
                PersonCustom personCustom=new PersonCustom();
                personCustom.setPname(row.getCell(1).toString());
                personCustom.setPhone(row.getCell(3).toString());
                personCustom.setTelephone(row.getCell(2).toString());
                personCustom.setOfficeaddress(row.getCell(5).toString());
                personCustom.setPtype("专责");
                personCustom.setPcomp("国网宁夏电力有限公司信通公司");
                personService.savePerson(personCustom);
            }
        }
        List<PersonCustom> persons=personService.queryPersonList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("personsList",persons);
        modelAndView.setViewName("person/Person_List");
        return modelAndView;
    }



    public String getcharPinYin(char pinYinStr) throws BadHanyuPinyinOutputFormatCombination {
        HanyuPinyinOutputFormat format=new HanyuPinyinOutputFormat();
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);


        String []pinyin=PinyinHelper.toHanyuPinyinStringArray(pinYinStr,format);
        if(pinyin ==  null){
            return null;

        }
        return pinyin[0];
    }


}
