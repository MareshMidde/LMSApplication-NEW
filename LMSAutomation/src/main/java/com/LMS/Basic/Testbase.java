package com.LMS.Basic;

 

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LMS.config.ApplicationConfig;
import com.LMS.pages.Loginpage;
import com.LMS.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static WebDriver driver;
	//public static Properties config;
	public static FileInputStream fis;
	public static String browser;
	 
	static ApplicationConfig config= ApplicationConfig.getApplicationConfig();
	public static void initialization() throws Exception{
		if (config.getProperty("browser").equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (config.getProperty("browser").equals("chrome")) {

			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			 driver=new ChromeDriver(chromeOptions);  
			
		} else if (config.getProperty("browser").equals("ie")) {

			WebDriverManager. iedriver(). setup(); 
			driver = new InternetExplorerDriver();

		}
		Loginpage loginpage =new Loginpage(); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(config.getProperty("url"));
	 
	}
	 
	}
	


