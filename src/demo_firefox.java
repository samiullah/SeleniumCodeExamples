import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	8
		
		
	  // ChromeDriver driver = new ChromeDriver();
	  System.setProperty("webdriver.firefox.driver","geckodriver");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  String pageTitle = driver.getTitle();
	  System.out.println(pageTitle);
	 
	  driver.quit();
	
	}

}
