package com.elite.base;
import org.apache.log4j.Logger;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.elite.utilities.ExcelReader;



public class BaseTest {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	
	public static void initConfiguration() {
		
		if(Constants.browser=="chrome") {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver= new ChromeDriver();
			log.debug("chrome launched");
			driver.get(Constants.testUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Constants.implicitWait, TimeUnit.SECONDS);
			
			
		}
		
	}
	

}
