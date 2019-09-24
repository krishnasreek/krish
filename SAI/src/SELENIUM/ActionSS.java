package SELENIUM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		ScreenShotsPO.SS(driver);
			
		
		

	}

}
