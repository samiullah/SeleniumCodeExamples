import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoActionsMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		
		WebElement x = driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]"));
		
		action.moveToElement(x).build().perform();
		Thread.sleep(2000);
		

	}

}
