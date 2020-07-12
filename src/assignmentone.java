import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignmentone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		checkbox.click();
		
		Thread.sleep(2000);
		
		
		
		Assert.assertTrue(checkbox.isSelected());
		
		checkbox.click();
		Thread.sleep(2000);
		

		Assert.assertFalse(checkbox.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		
		
		
		
		
		
		
		

	}

}
