package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div/div[2]/ol/li[1]/a")).click();
		
		

	}

}
