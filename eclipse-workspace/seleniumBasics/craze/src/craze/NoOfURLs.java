package craze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfURLs {

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the URL: ");
		String URL_Console = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\OneDrive\\Desktop\\2.0\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_Console);
		
		Thread.sleep(2000);
		String Exp_title = driver.getTitle();
		System.out.println(Exp_title);
		FileReader FR = new FileReader("C:\\Users\\lenovo\\OneDrive\\Desktop\\2.0\\TEXTFILO.txt");
		BufferedReader br = new BufferedReader(FR);
		String Act;
		while((Act=br.readLine())!=null){
			System.out.println(Act);
		}
		if(Act.equals(Exp_title)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case will be failed");
		}
		
	}

}
