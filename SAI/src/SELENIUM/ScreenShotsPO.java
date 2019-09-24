package SELENIUM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class ScreenShotsPO {
	public static void SS(WebDriver driver) throws IOException {
		int i; 
		for(i=1;i<=3;i++) {
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\HP\\Desktop\\krish\\"+i+".jpg");
		Files.copy(SrcFile,DestFile);
		System.out.println("file is copied");
		}
		
	}

}
