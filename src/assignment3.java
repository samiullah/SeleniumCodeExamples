import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		
		driver.findElement(By.xpath("//a[contains(text(),\"Click to\")]")).click();;
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//div[@id=\"results\"]"), "Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page."));

	    driver.quit();
		

	}

}
