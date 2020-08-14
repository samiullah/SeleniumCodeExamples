import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleDemoRobot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("realbox-icon")).sendKeys("saba");
		driver.findElement(By.id("realbox-icon")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		

	}

}
