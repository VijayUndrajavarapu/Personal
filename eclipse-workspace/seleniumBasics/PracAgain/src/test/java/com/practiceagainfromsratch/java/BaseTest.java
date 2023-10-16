package com.practiceagainfromsratch.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void launch(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else {
			System.out.println("Give proper launching site");
		}
	}
}
