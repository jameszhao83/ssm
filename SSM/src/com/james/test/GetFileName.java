package com.james.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class GetFileName
{


    public static  void main(String args[]){

        File file=new File("G:\\开发\\Springmvc+Mybatis由浅入深全套视频教程\\mybatis\\day01\\code\\mybatis1222\\lib");

        File[] filess=file.listFiles();

       if (filess != null) {

           for (File a : filess) {
               if (a.isFile()) {
                   System.out.println(a.getName());
               }
           }

       }

    }
}
