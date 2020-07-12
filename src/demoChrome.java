import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoChrome {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String a = driver.getTitle();
		System.out.println(a);
		String b = driver.getCurrentUrl();
		System.out.println(b);
		String c = driver.getPageSource();
		System.out.println(c);
		
		driver.navigate().back();
		String d= driver.getCurrentUrl();
		System.out.println(d);
		driver.close();
		
	}
	
}