package SELENIUM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionTest {

	public static void main(String[] args) {
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("https://connect.maveric-systems.com");
		ConnectLogin.username(driver).sendKeys("krishnasreek");
		ConnectLogin.password(driver).sendKeys("Saiteja@1421");
		ConnectLogin.login(driver).click();
		/*WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginForm_password\"]")));
		driver.findElement(By.id("LoginForm_password")).sendKeys("ggdh");*/
	}

}
