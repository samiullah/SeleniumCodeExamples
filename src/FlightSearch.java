import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.easemytrip.com/";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		WebElement From = driver.findElement(By.cssSelector("#FromSector_show"));
		
		From.click();
		
		Thread.sleep(3000);
		From.clear();
		From.sendKeys("MAA");
		Thread.sleep(3000);
		From.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement To = driver.findElement(By.cssSelector("#Editbox13_show"));
		
		To.clear();
		To.sendKeys("BLR");
		Thread.sleep(3000);
		To.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement currentdate = driver.findElement(By.xpath("//li[@class=\"active-date\"]"));
		currentdate.click();
		Thread.sleep(2000);
		
	    WebElement returnd = driver.findElement(By.id("rdatelbl"));
	    
	   System.out.println(returnd.getAttribute("style").contains("0.4")); 
	   
	   Thread.sleep(2000);
	   driver.quit();
		
		
		
		
		
		
		

	}

}
