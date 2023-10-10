package com.LMS.testcases;

import com.LMS.Basic.Testbase;
import com.LMS.config.ApplicationConfig;
import com.LMS.pages.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginpageTest extends Testbase {
	static ApplicationConfig config = ApplicationConfig.getApplicationConfig();
	static Loginpage loginpage =new Loginpage(); 
	public static void main(String[] args) throws Exception {
		
		 initialization();
		 Thread.sleep(3000);
		 
		 loginpage.login(config.getProperty("username"),config.getProperty("password"));
		 


	}

}
