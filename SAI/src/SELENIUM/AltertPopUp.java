package SELENIUM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AltertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//String ele = alert.getText();
		//System.out.println("text="+ele);
		//Thread.sleep(5000);
		// alert.accept();	
		alert.dismiss();
		 driver.findElement(By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; promptConfirm()']")).click();
		 Thread.sleep(2000);
		 Alert alert1 = driver.switchTo().alert();
		 Thread.sleep(5000);
		 alert1.sendKeys("no");
	}

}
