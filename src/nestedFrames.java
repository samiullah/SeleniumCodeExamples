import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		String x = driver.findElement(By.xpath("//div[@id=\"content\"]")).getText();
		System.out.println(x);
	
		
	}

}
