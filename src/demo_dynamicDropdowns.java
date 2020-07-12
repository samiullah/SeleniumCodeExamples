import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_dynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(1000);
		
		for(int i = 0; i<4; i++) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		
		driver.quit();
		

	}

}
