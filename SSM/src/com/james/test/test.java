package com.james.test;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {

        System.out.println("syso");

        HSSFWorkbook hwb= new HSSFWorkbook(new FileInputStream(new File("D:\\readexcel\\backinterview.xls")));
        HSSFSheet hssfSheet=null;
        int i=hwb.getSheetIndex("Sheet2");
        hssfSheet=hwb.getSheetAt(i);

        for(int j=0;i<hssfSheet.getLastRowNum();j++){
            HSSFRow row=hssfSheet.getRow(j);
            if(row != null) {
                if (!row.getCell(6).toString().trim().equals("") && row.getCell(6) != null) {
                    System.out.print(row.getCell(6));
                    System.out.println(" "+row.getCell(4));
                }

            }
        }



    }
}
