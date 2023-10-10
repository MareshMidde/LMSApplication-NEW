package com.LMS.config;

import java.io.FileInputStream;
import java.util.Properties;


public class ApplicationConfig
{
	private static Properties properties;
	static public ApplicationConfig config;
	
	public ApplicationConfig(){
		//FileReader reader=new FileReader("D:\\772\\LMSAutomation\\src\\main\\java\\com\\LMS\\config\\config.properties");  
		
		
		try {
			properties=new Properties();
			properties.load( new FileInputStream("D:\\772\\LMSAutomation\\src\\main\\java\\com\\LMS\\config\\config.properties"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error occured in the loading congifuration ::::");
			e.printStackTrace();
		}
	
		
	}
	public static ApplicationConfig getApplicationConfig()
	{
		if(config==null)
		{
			config=new ApplicationConfig();
		}
		return config;
	}
	
	public static String getProperty(String propName)
	{
		return properties.getProperty(propName);
	}
	
	public void doEmptyProps()
	{
		if(properties !=null)
		{
			properties=null;
		}
		
		if(config !=null)
		{
			config=null;
		}
	}
	
}
