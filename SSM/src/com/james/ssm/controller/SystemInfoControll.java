package com.james.ssm.controller;

import com.james.ssm.po.*;
import com.james.ssm.service.SystemInfoService;
import com.sun.prism.shader.Solid_ImagePattern_Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class SystemInfoControll {



    @Autowired
    SystemInfoService systemInfoService;



    @RequestMapping("/querySystemInfoList")
    public ModelAndView querySystemInfoList(SysteminfoExample systeminfoExample){

        List<Systeminfo> systeminfos = systemInfoService.selectByExample(systeminfoExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("systeminfos",systeminfos);
        modelAndView.setViewName("systeminfo/systeminfo_List");
        return  modelAndView;
    }

    @RequestMapping("addSystemInfoView")
    public ModelAndView addSystemInfoView(){


        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("systeminfo/systeminfo_add");
        return modelAndView;
    }
    @RequestMapping("saveSystemInfo")
    public ModelAndView saveSystemInfo(SysteminfoExample systeminfoExample, Systeminfo systeminfo){
        System.out.println(systeminfo ==  null);
        systemInfoService.insert(systeminfo);
        List<Systeminfo> systeminfos = systemInfoService.selectByExample(systeminfoExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("systeminfos",systeminfos);
        modelAndView.setViewName("systeminfo/systeminfo_List");
        return  modelAndView;
    }
    @RequestMapping("/findSystemInfoById")
    public  ModelAndView  findItemsById(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        Integer id= Integer.valueOf(request.getParameter("id"));
        Systeminfo systeminfo=systemInfoService.selectByPrimaryKey(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("systeminfo",systeminfo);
        modelAndView.setViewName("systeminfo/systeminfo_by_id");
        return  modelAndView;
    }
    @RequestMapping("/updateSystemInfo")
    public ModelAndView updateSystemInfo(SysteminfoExample systeminfoExample, Systeminfo systeminfo){
        System.out.println(systeminfo == null);
        System.out.println(systeminfo.getSystemname());
        systemInfoService.updateByPrimaryKey(systeminfo);
        List<Systeminfo> systeminfos = systemInfoService.selectByExample(systeminfoExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("systeminfos",systeminfos);
        modelAndView.setViewName("systeminfo/systeminfo_List");
        return  modelAndView;

    }

}
