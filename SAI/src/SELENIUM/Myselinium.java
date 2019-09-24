package SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myselinium {

	public static void main(String[] args) {
		WebDriver driver,tryprime;
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
	 driver =new ChromeDriver();
	 
   /* driver.get("https://connect.maveric-systems.com");
   /* driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("krishnasreek");
    driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).sendKeys("krish@1421");*/
  /* List<WebElement> username=driver.findElements(By.tagName("input"));
   System.out.println("Number of elements:" +username.size());*/
    
    
    
    
  /*  driver.findElement(By.id("LoginForm_rememberMe")).click();
  WebElement  check =driver.findElement(By.id("LoginForm_rememberMe"));
  System.out.println(check.isSelected());
  if(check.isSelected())
  {
	  System.out.println("the button is on");
  }
  else
  {
	  System.out.println("the button is off");
  }*/
  //username.sendKeys("krishnasreek");
   
    
    //driver.findElement(By.name("yt0")).click();
   
   // driver.quit();
	// driver.get("https://www.amazon.in");
	//  tryprime =(WebDriver) new Select(driver.findElement(By.className("nav-icon nav-arrow")));
	// ((Select) tryprime).selectByVisibleText("Beauty");
	 driver.get("https://connect.maveric-systems.com");
	 driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("krishnasreek");
	 driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).sendKeys("krish@1421");
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input")).click();
	 String text = driver.findElement(By.xpath("//*[@id=\"content\"]/p")).getText();
	 System.out.println("text="+text);
	 
	}

}
