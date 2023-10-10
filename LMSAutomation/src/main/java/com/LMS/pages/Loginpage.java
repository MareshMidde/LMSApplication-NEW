package com.LMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Basic.Testbase;

public class Loginpage extends Testbase {
	
	
	@FindBy(xpath="//input[@id='UserName']")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='loginBtn']")
	WebElement loginbtn;
	
	
	public Loginpage(){
		PageFactory.initElements(driver, this); 
	}
	public void login(String un,String pw){
		 
		username.sendKeys(un);
		 
		password.sendKeys(pw);
		 
		loginbtn.click();
	}
	
	

}
