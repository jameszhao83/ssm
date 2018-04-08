package com.james.ssm.controller;

import com.james.ssm.po.Inspection;
import com.james.ssm.po.InspectionExample;
import com.james.ssm.po.Recondition;
import com.james.ssm.po.ReconditionExample;
import com.james.ssm.service.InspectionService;
import com.james.ssm.service.ReconditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class InspectionControll {

    @Autowired
    InspectionService inspectionService;


    @RequestMapping("/queryInspectionList")
    public ModelAndView queryInspectionList(InspectionExample inspectionExample){

        List<Inspection> inspections = inspectionService.selectByExample(inspectionExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("inspections",inspections);
        modelAndView.setViewName("inspection/inspection_List");
        return  modelAndView;
    }

    @RequestMapping("addInspectionView")
    public ModelAndView addInspectionView(){


        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("inspection/inspection_add");
        return modelAndView;
    }
    @RequestMapping("saveInspection")
    public ModelAndView saveInspection(InspectionExample inspectionExample, Inspection inspection){
        inspectionService.insert(inspection);
        List<Inspection> inspections = inspectionService.selectByExample(inspectionExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("inspections",inspections);
        modelAndView.setViewName("inspection/inspection_List");
        return  modelAndView;
    }
}
