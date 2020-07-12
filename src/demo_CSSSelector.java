import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("#username")).sendKeys("dwefer");
		driver.findElement(By.cssSelector("#password")).sendKeys("wferferf");
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(1000);
		driver.quit();
		

	}

}
