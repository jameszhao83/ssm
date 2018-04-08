package com.james.ssm.controller;

import com.james.ssm.po.Items;
import com.james.ssm.po.ItemsCustom;
import com.james.ssm.po.ItemsQueryVo;
import com.james.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class ItemsControll4 {

    @Autowired
    ItemsService itemsService;


    @RequestMapping("/queryItemsList")
    public ModelAndView queryItemsList(){

        List<ItemsCustom> items=itemsService.queryItemList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemslist",items);
        modelAndView.setViewName("itemslist");
        return  modelAndView;
    }

    @RequestMapping("/findItemsById")
    public  ModelAndView  findItemsById(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        Integer id= Integer.valueOf(request.getParameter("id"));
        Items items=itemsService.findItemsById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("items",items);
        modelAndView.setViewName("findItemsById");
        return  modelAndView;
    }

    @RequestMapping("/updateItems")
    public ModelAndView updateItems(HttpServletRequest request,Integer id,ItemsCustom itemsCustom,MultipartFile items_pic) throws IOException {
        System.out.println("items_pic ==  null"+items_pic ==  null);
        String originalFileName=items_pic.getOriginalFilename();

        System.out.println(originalFileName);
        if(items_pic != null && originalFileName != null && originalFileName.length()>0){
            String pic_path="F:\\develop\\uploadFile\\";
            String newFileName= UUID.randomUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));
            File newFile=new File(pic_path+newFileName);
            items_pic.transferTo(newFile);
            itemsCustom.setPic(newFileName);
        }
        itemsService.updateItems(itemsCustom);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemsCustom",itemsCustom);
        modelAndView.setViewName("updateItemsSuccess");
        return  modelAndView;

    }
    @RequestMapping("/queryByItemName")
    public  ModelAndView queryByItemName(ItemsQueryVo itemsQueryVo){

        List<ItemsCustom> items=itemsService.queryItemList(itemsQueryVo);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemslist",items);
        modelAndView.setViewName("itemslist");
        return  modelAndView;
    }

    @RequestMapping("/batchDeleteItems")
    public  ModelAndView batchDeleteItems(Integer [] items_Ids){
        for(Integer id :items_Ids){
            System.out.println(id);
        }
        List<ItemsCustom> items=itemsService.queryItemList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemslist",items);
        modelAndView.setViewName("itemslist");
        return  modelAndView;
    }
    @RequestMapping("/addItem")
    public ModelAndView addItem (){

        ModelAndView modelAndView=new ModelAndView();

        modelAndView.setViewName("addItem");
        return  modelAndView;

    }
    @RequestMapping("/saveItem")
    public  ModelAndView saveItem(ItemsQueryVo itemsQueryVo,MultipartFile items_pic) throws IOException {
        String originalFileName=items_pic.getOriginalFilename();
        System.out.println(originalFileName);
        if(items_pic != null && originalFileName != null && originalFileName.length()>0){
            String pic_path="F:\\develop\\uploadFile\\";
            String newFileName= UUID.randomUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));
            File newFile=new File(pic_path+newFileName);
            items_pic.transferTo(newFile);
            itemsQueryVo.getItemsCustom().setPic(newFileName);
        }

        itemsService.saveItem(itemsQueryVo.getItemsCustom());
        List<ItemsCustom> items=itemsService.queryItemList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemslist",items);
        modelAndView.setViewName("itemslist");
        return modelAndView;
    }

    @RequestMapping("itemsBatchUpdate")
    public   ModelAndView itemsBatchUpdate(){




        List<ItemsCustom> items=itemsService.queryItemList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemslist",items);
        modelAndView.setViewName("items_batch_update");
        return modelAndView;
    }
    @RequestMapping("itemsBatchUpdateSave")
    public   ModelAndView itemsBatchUpdateSave(ItemsQueryVo itemsQueryVo){


        List<ItemsCustom> itemsCustoms=itemsQueryVo.getItemsCustoms();

        itemsService.itemsBatchUpdateSave(itemsCustoms);
        List<ItemsCustom> items=itemsService.queryItemList(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemslist",items);
        modelAndView.setViewName("itemslist");
        return modelAndView;
    }
    @RequestMapping("jsonResponse")
    public @ResponseBody ItemsCustom jsonResponse(@RequestBody ItemsCustom itemsCustom){

        return  itemsCustom;
    }
    @RequestMapping("jsonTest")
    public ModelAndView jsonTest(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("JsonTest");
        return modelAndView;
    }
}
