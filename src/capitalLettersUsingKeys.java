import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class capitalLettersUsingKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.in");
		Thread.sleep(3000); // due to slow network
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		Thread.sleep(3000); //debugging purposes
		driver.quit();

	}

}
