package com.basics.seljava;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC_log4j extends BaseTest{
	
	static Logger log = Logger.getLogger(TC_log4j.class);
	//getLogger() is a method. is a static method
	//Static method we call it with class name (Logger.getLogger()).
	
	public static void main(String[] args) throws Exception {
		
		init();
		log.info("initializing the property files!");
		
		launchBrowser();
		log.info("launching the browser:  " + p.getProperty("browser"));
		
		NavigateURL();
		log.info("navigating URL:  "+ ChildP.getProperty("url"));
		
		sleep(3000);
		
		pageTitle();
		log.info("Page Title PRINTED");
		
		ClickElement("register_xpath");
		log.info("click on element by using locator:  " + OrProp.getProperty("register_xpath"));
		
		ClickElement("adminPage_xpath");
		log.info("click on element by using locator:  " + OrProp.getProperty("adminPage_xpath"));
		WebElement element1 = driver.findElement(By.xpath(OrProp.getProperty("Home_xpath")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element1);
	}
}
