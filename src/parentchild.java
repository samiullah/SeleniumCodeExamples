import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@class=\"RNNXgb\"]/div/div[2]/input")).sendKeys("ferferf");
		
		driver.close();
	}

}
