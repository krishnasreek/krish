package SELENIUM;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi {

	public static void main(String[] args) {
		FileInputStream flinput= new FileInputStream( new File("C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\POI.xlsx"));
		try {
		XSSFWorkbook wb= new XSSFWorkbook(flinput);
		
		XSSFSheet sheet= wb.getSheetAt(0);
		
		Iterator<Row> rowInterator = sheet.iterator();
		
		while (rowInterator.hasNext()) {
			Row rw= rowInterator.next();
			
			Iterator<Cell> cellIterator=rw.cellIterator();
			while(cellIterator.hasNext()) {
				
				Cell cl =cellIterator.next();
				
				switch(cl.getCellType()) {
				
				case NUMERIC :
					int x = (int) (cl.getNumericCellValue());
					System.out.print(x + '\t');
					break;
				case STRING : System.out.print(cl.getStringCellValue() + '\t');
				break;
				case BLANK:
					break;
				case BOOLEAN:
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				case _NONE:
					break;
				default:
					break;
				}
			}
			System.out.println("");
			}
		     
		flinput.close();
	}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
