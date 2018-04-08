package com.james.ssm.controller;

import com.james.ssm.po.Memuleft;
import com.james.ssm.po.MemuleftExample;
import com.james.ssm.service.MemuleftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MemuleftControll {
    @Autowired
    MemuleftService memuleftService;


    @RequestMapping("/queryMemuleftList")
    public ModelAndView queryMemuleftList(MemuleftExample memuleftExample){

        List<Memuleft> memulefts = memuleftService.selectByExample(memuleftExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("memuleftsList",memulefts);
        modelAndView.setViewName("memuleft/memulefts_List");
        return  modelAndView;
    }

    @RequestMapping("addMemuleftView")
    public ModelAndView addMemuleftView(){


        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("memuleft/memuleft_add");
        return modelAndView;
    }
    @RequestMapping("saveMemuleft")
    public ModelAndView saveMemuleft(MemuleftExample memuleftExample,Memuleft memuleft){

        memuleftService.insert(memuleft);
        List<Memuleft> memulefts = memuleftService.selectByExample(memuleftExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("memuleftsList",memulefts);
        modelAndView.setViewName("memuleft/memulefts_List");
        return  modelAndView;
    }
}
