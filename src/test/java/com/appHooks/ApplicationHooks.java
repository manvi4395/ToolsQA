package com.appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	public WebDriver driver;
	
	private DriverFactory driverFactory;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		
		ConfigReader configReader = new ConfigReader();
		
		prop = configReader.init_prop();
		
	}
	
	@Before(order = 1)
	public void launchBrowser() {
		
		String browserName = prop.getProperty("browser");
		
		driverFactory = new DriverFactory();
		
		driver = driverFactory.init_driver(browserName);
		
		driverFactory.getDriver().get("Url");
		
		}
	
	@After(order = 1)
	public void quitBrowser() {
		
		 driver.quit();
		 
	}

}
