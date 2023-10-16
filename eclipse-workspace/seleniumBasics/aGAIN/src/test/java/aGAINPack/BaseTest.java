package aGAINPack;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
		
		public static WebDriver driver;
		public static Properties p;
		public static Properties Mainp;
		public static FileInputStream fis;
		public static Properties Childp;
		public static String cref;
		
		public static void launchMainBrowser(String Browser) {			//Browser Launch
			if (Browser.equals("chrome")) {
				System.out.println("opening Chrome");
				driver = new ChromeDriver();
			}else if (Browser.equals("firefox")) {
				System.out.println("opening firefox");
				driver = new FirefoxDriver();
			}else {
				System.out.println("Page will not open please give proper browser name");
			}
		}
		public static void init() throws Exception {		//initialization
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties");
			p = new Properties();
			p.load(fis);
			
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\environment.properties");
			Mainp = new Properties();
			Mainp.load(fis);
			String mref = Mainp.getProperty("environ");
			System.out.println(mref);

			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\" +mref+ ".properties");
			Childp = new Properties();
			Childp.load(fis);
			cref = Childp.getProperty("PHPT");
			System.out.println(cref);
		}
		public static void NavigateURL(String pageURL) {
			System.out.println("BrowserOpened: Navigating to URL ");
			driver.navigate().to(Childp.getProperty(pageURL));
		}
		public static void launchBrowser1(String URL) {	//Dummy
			System.out.println("opening browser!");
			driver = new ChromeDriver();
			driver.navigate().to(URL);
		}
}
