package SELENIUM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollView {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 driver.get("https://www.seleniumhq.org/download/");
		 Thread.sleep(2000);
		WebElement Element = driver.findElement(By.xpath("(//span[@class='unsupported'])[2]"));
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 ScreenShotsPO.SS(driver);

	}

}
