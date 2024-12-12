package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelGenerator {

   public void ExcelGenerator(List<bookDto> book) throws Exception {
	   
	   Workbook workbook = new HSSFWorkbook();
	   
	   Sheet sheet = workbook.createSheet("book-data");
	   
          Row headerrow = sheet.createRow(0);
	   
          headerrow.createCell(0).setCellValue("id");
          headerrow.createCell(1).setCellValue("bname");
          headerrow.createCell(2).setCellValue("bprices");
	   
          int dataRowIndex = 1;
          
          for(bookDto b : book) {
        	  
        	  Row datarow = sheet.createRow(dataRowIndex);
        	  
        	  datarow.createCell(0).setCellValue(b.getId());
        	  datarow.createCell(1).setCellValue(b.getBname());
        	  datarow.createCell(2).setCellValue(b.getBprices());
        	  
        	  dataRowIndex++;
          }
          
          File f = new File("book.xls");
          FileOutputStream fos = new FileOutputStream(f);
        		
        		  workbook.write(fos);
           fos.close();
           workbook.close();
   }

}
