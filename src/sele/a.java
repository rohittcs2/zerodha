package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver","C:\\Users\\GLOBAL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.amazon.in/");
	
	}

}
