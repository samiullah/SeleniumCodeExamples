import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoNewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.id("iframeResult"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame);
		
		String loc = "//a[contains(text(),\"Visit W3Schools.com!\")]";
		//driver.findElement(By.xpath(loc)).click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath(loc))).build().perform();
		action.contextClick(driver.findElement(By.xpath(loc))).		
		
		
		
	    
		
		
		
		Thread.sleep(2000);
		
		

	}

}
