package com.james.ssm.controller;

import com.james.ssm.po.Items;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemsControll2 implements HttpRequestHandler {


    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Items> items=new ArrayList<>();
        Items it1=new Items();
        it1.setName("打电脑");
        it1.setPrice(500f);
        it1.setDetail("this is a big computer");
        Items it2=new Items();
        it2.setName("打电脑");
        it2.setPrice(500f);
        it2.setDetail("this is a big computer");
        Items it3=new Items();
        it3.setName("打电脑");
        it3.setPrice(500f);
        it3.setDetail("this is a big computer");
        Items it4=new Items();
        it4.setName("打电脑");
        it4.setPrice(500f);
        it4.setDetail("this is a big computer");
        Items it5=new Items();
        it5.setName("打电脑");
        it5.setPrice(500f);
        it5.setDetail("this is a big computer");
        items.add(it1);
        items.add(it2);
        items.add(it3);
        items.add(it4);
        items.add(it5);
        request.setAttribute("itemslist",items);
        request.getRequestDispatcher("/WEB-INF/jsp/itemslist2.jsp").forward(request,response);

    }
}

