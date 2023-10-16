package craze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class may {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("vijay");
		//System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\lenovo\\\\Downloads\\\\chromedriver_win32 (1).zip");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\OneDrive\\Desktop\\2.0\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/");
        String expectedTitle = driver.getTitle();
        String actualTitle = "OpenCart - Open Source Shopping Cart Solution";
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("Test Case will be passed");
        }else {
        	System.out.println("Test case will be failed");
        }
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.id("press")).click();
        
	}
	

}
