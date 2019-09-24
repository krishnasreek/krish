package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionPageFactory {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://connect.maveric-systems.com");
		PageF p = new PageF(driver) ;
		p.Username.sendKeys("hgfhk");
		p.Password.sendKeys("hjghj");
		
			
		
	}

}
