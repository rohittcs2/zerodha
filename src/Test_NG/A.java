package Test_NG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	

	public class KiteTestT {
	 //declare all useful members as global
	 Sheet sh;
	 WebDriver driver;
	 KiteLogin1pageT login1;
	  KiteLogin2pageT login2;
	  KiteHomepageT home;
		
	@BeforeClass
	public void openBrowser() throws Throwable {
	 FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Documents\\may7.xlsx");
	 sh = WorkbookFactory.create(fis).getSheet("may7");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    //all objects of POM class
	    login1=new KiteLogin1pageT(driver);
	     login2=new KiteLogin2pageT (driver);
	     home=new KiteHomepageT(driver);
	}
	@BeforeMethod
	public void loginToApp() {
	 //enter un
	  String username = sh.getRow(0).getCell(0).getStringCellValue();//DPG458
	  login1.enterUN(username);
	  //enter pwd
	  String password = sh.getRow(0).getCell(1).getStringCellValue();
	 login1.enterPWD(password);
	 //clck on login btn
	 login1.clickLOGINBTN();
		
	 //enter pin
	 String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
	 login2.enterPIN(pinvalue);
	 //click on continue btn
	 login2.clickcntBtn();
	}
	@Test
	public void verifyuserID() {
	 Reporter.log("running verify user id",true);
	 String actID = home.verifyuserID();
	  String expID = sh.getRow(0).getCell(0).getStringCellValue();
	 Assert.assertEquals(expID,actID,"both are different tc is failed");
	}
	@AfterMethod
	public void logoutApp() {
	 Reporter.log("logout the application",true);
	}
	@AfterClass
	public void closeBrowser() {
	 Reporter.log("close the app",true);
	}
	}
