import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("frferf");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dewdwefrfre");
		driver.findElement(By.xpath("//label[@id=\"loginbutton\"]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
