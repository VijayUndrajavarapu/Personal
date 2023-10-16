package sept20Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.hyrtutorials.com/");
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getTitle());
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.hyrtutorials.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
