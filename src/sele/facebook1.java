package sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook1 {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GLOBAL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
;
			WebDriver driver=new FirefoxDriver();
			
			// to go to fb page
			driver.get("https://www.facebook.com/");
		
			// implecitly wait
			//driver.manage().timeouts().implicitlyWait(10, null);
			
			// for enter user name
			driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rohitpatil");
			
			// for enter pwd
			driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("9589518385");
		
			// to click on log in button
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}
}

