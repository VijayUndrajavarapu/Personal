package sept20Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void Launch(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver =new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String URL) {
		driver.get(URL);
	}
	
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void maxi() {
		driver.manage().window().maximize();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void getCurrentURL() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void NavigateBack() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	public static void NavigateFarword() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().forward();
	}
	
	public static void refresh() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
}
