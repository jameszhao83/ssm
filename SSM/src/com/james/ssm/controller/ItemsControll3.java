package com.james.ssm.controller;

import com.james.ssm.po.Items;
import com.james.ssm.po.ItemsCustom;
import com.james.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@Controller
public class ItemsControll3 {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/queryItemList")
    public ModelAndView queryItemList(){


        List<ItemsCustom> items=itemsService.queryItemList(null);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemslist",items);
        modelAndView.setViewName("itemslist");
        return  modelAndView;
    }



}

