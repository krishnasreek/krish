package SELENIUM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Table.Cell;

public class ExcelUsing {
	 public static void main(String args[]) throws IOException,FileNotFoundException, InvalidFormatException {
		
		 FileInputStream file = new FileInputStream("C:\\Users\\HP\\Documents\\krish.xlsx");
		  XSSFWorkbook workbook =new XSSFWorkbook(file);
		  XSSFSheet sheet= workbook.getSheet("Sheet1");
		  int rowCount = sheet.getLastRowNum();
		 System.out.println("row count="+rowCount);
		  
		  


	}

}
