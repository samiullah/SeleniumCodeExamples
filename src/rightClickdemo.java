import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rightClickdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(xpathExpression))
		
	}

}
