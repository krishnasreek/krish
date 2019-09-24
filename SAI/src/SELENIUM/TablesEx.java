package SELENIUM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TablesEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		
		   String ele="Clock Tower Hotel";
		String ele1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='"+ele+"']//following-sibling::td[2]")).getText();
         
		System.out.println("text given name="+ele);
		System.out.println("text given city="+ele1);
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\HP\\Desktop\\krish\\KS.jpg");
		Files.copy(SrcFile,DestFile);
		
	}

}
