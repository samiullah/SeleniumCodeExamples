import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_followingsibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.findElement(By.xpath("//li[@class=\"sfHoverForce\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class=\"sfHoverForce\"]/following-sibling::li[1]")).click();
		Thread.sleep(3000);
		
		// this one is not working
		driver.findElement(By.xpath("//li[@class=\"sfHoverForce\"]/following-sibling::li[2]")).click();
		driver.quit();

	}

}
