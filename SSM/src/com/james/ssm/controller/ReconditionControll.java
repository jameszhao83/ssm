package com.james.ssm.controller;

import com.james.ssm.po.PersonCustom;
import com.james.ssm.po.PersonQueryVo;
import com.james.ssm.po.Recondition;
import com.james.ssm.po.ReconditionExample;
import com.james.ssm.service.ReconditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class ReconditionControll {
    @Autowired
    ReconditionService reconditionService;


    @RequestMapping("/queryReconditionList")
    public ModelAndView queryReconditionList(ReconditionExample reconditionExample){

        List<Recondition> reconditions = reconditionService.selectByExample(reconditionExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("reconditionsList",reconditions);
        modelAndView.setViewName("recondition/reconditions_List");
        return  modelAndView;
    }

    @RequestMapping("addReconditionView")
    public ModelAndView addReconditionView(){


        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("recondition/recondition_add");
        return modelAndView;
    }
    @RequestMapping("saveRecondition")
    public ModelAndView saveRecondition(ReconditionExample reconditionExample,Recondition recondition){
        recondition.setConfirm(new String("1").getBytes());
        recondition.setDpconfirm(null);
        recondition.setIsdown(null);
        recondition.setIsruntypechange(null);
        recondition.setRwindow(null);
        recondition.setSgccconfirm(null);
        recondition.setSgccsdconfirm(null);
        recondition.setSgcccsconfirm(null);
        reconditionService.insert(recondition);
        List<Recondition> reconditions = reconditionService.selectByExample(reconditionExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("reconditionsList",reconditions);
        modelAndView.setViewName("recondition/reconditions_List");
        return  modelAndView;
    }
}
