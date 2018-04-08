package com.james.ssm.controller;

import com.james.ssm.po.PersonCustom;
import com.james.ssm.po.PersonQueryVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class indexControll {



    @RequestMapping("/index.action")
    public ModelAndView queryPersonList(PersonQueryVo personQueryVo){
//        List<PersonCustom> persons=personService.queryPersonList(personQueryVo);

        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("personsList",persons);
        modelAndView.setViewName("person/Person_List");
        return  modelAndView;
    }
}
