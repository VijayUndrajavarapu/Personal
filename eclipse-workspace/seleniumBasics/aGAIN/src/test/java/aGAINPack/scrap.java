package aGAINPack;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrap {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(scrap.class);
	
	public static void main(String[] args) throws Exception {
//		alertsmeth();
//		HandlingWindows();
//		iframes();
		WaitImplicit();
	}
	//Alerts
	public static void alertsmeth() throws Exception {
		driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(4000);
		String Sim = driver.switchTo().alert().getText();
		System.out.println("alert:  "+ Sim);
		driver.switchTo().alert().accept();
//		driver.quit();
		driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
//		Thread.sleep(2000);
		String Sim2 = driver.switchTo().alert().getText();System.out.println("alert:  "+ Sim2);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id='promptBox']")).click();
		Alert Al1 = driver.switchTo().alert();
		Al1.sendKeys("VijayKumar!");
		Al1.accept();
	}
	//WindowHandlings
	public static void HandlingWindows() throws Exception {
		driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		log.info("********Handling Windows**********");
		String ParentWindow= driver.getWindowHandle();
		System.out.println("ParentWindow:"+ParentWindow +"********" + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> AllWindows= driver.getWindowHandles();
		
		for (String handling : AllWindows) {
			if(!handling.equals(ParentWindow)) {
				driver.switchTo().window(handling);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindow);Thread.sleep(3000);
		System.out.println(ParentWindow + "*************TITLE:" + driver.getTitle());
		
		driver.close();
	}
	//iFrames
	public static void iframes() {

		driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		log.info("********IFRAMES**********");
	}
	//Implicitlywait
	@SuppressWarnings("deprecation")
	public static void WaitImplicit() {

		driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		//Implicitlywait is deprcated from 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='btn1']")).click();
		driver.findElement(By.xpath("//*[@id='txt1']")).sendKeys("vijay");
		driver.findElement(By.xpath("//*[@id='btn2']")).click();
		driver.findElement(By.xpath("//*[@id='txt2']")).sendKeys("kumar");
	}
	//Explicit wait
	public static void WaitExplicit() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
