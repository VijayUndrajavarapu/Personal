package sept20Package;

public class TC_001 extends BaseTest{
	public static void main(String[] args) {
		
		Launch("chrome");
		deleteCookies();
		 navigateUrl("https://www.hyrtutorials.com/");
		 getTitle();
		 maxi();
		 deleteCookies();
		 getCurrentURL();
		 
		 quit();
	}
}
