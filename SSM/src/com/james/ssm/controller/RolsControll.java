package com.james.ssm.controller;

import com.james.ssm.po.PersonCustom;
import com.james.ssm.po.PersonQueryVo;
import com.james.ssm.po.Rols;
import com.james.ssm.po.RolsExample;
import com.james.ssm.service.RolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class RolsControll {
    @Autowired
    RolsService rolsService;


    @RequestMapping("/queryRolsList")
    public ModelAndView queryRolsList(RolsExample rolsExample){

        List<Rols> rolss = rolsService.selectByExample(rolsExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("rolssList",rolss);
        modelAndView.setViewName("rols/rolss_List");
        return  modelAndView;
    }

    @RequestMapping("addRolsView")
    public ModelAndView addRolsView(){


        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("rols/rols_add");
        return modelAndView;
    }
    @RequestMapping("saveRols")
    public ModelAndView saveRols(RolsExample rolsExample,Rols rols){

        rolsService.insert(rols);
        List<Rols> rolss = rolsService.selectByExample(rolsExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("rolssList",rolss);
        modelAndView.setViewName("rols/rolss_List");
        return  modelAndView;
    }
}
