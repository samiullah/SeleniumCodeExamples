import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("dwedwed");
		driver.findElement(By.cssSelector("#pass")).sendKeys("rfferf");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		driver.quit();

	}

}
