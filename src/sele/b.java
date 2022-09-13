package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class b {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		// WebDriverManager.chromedriver().setup();
		WebDriver driver=new FirefoxDriver();
		
// inspect user name 

		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
