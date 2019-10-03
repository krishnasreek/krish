package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FastTrack {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
         ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		WebDriver driver1 =new ChromeDriver(options);
		driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.fastrack.in");
		driver.findElement(By.xpath("//a[@class='close-icon']")).click();
		Thread.sleep(100);
		

	
		driver.findElement(By.xpath("//div[@class='close'")).click();
		driver.findElement(By.xpath("//a[@class='close-icon'][1]")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//span[@role='button']")).click();
		 Alert alert1 = driver.switchTo().alert();
		 alert1.dismiss();
		

	}

}
