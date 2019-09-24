package SELENIUM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEx {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button1")).click();
		String MainWindow=driver.getWindowHandle();
		Set <String> s1=driver.getWindowHandles();
		System.out.println("id"+MainWindow);
		System.out.println("id"+s1);
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String ChidWindow=i1.next();
			if(!MainWindow.equalsIgnoreCase(ChidWindow)) {
				driver.switchTo().window(ChidWindow);
				Thread.sleep(2000);
				driver.close();
			}
		}

	}

}
