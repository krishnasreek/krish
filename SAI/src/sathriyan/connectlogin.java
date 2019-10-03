package sathriyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class connectlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='LoginForm[username]']")).sendKeys("sathriyan5691");
		driver.findElement(By.id("LoginForm_password")).sendKeys("sdgjvfey");

	}

}
