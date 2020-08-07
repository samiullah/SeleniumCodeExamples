import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowsexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		WebElement test = driver.findElement(By.cssSelector("#openwindow"));
		
		test.click();
		System.out.println(	driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String> id = ids.iterator();
		Thread.sleep(2000);
		String parentId = id.next();
		System.out.println(parentId);
		Thread.sleep(2000);
		String childId = id.next();
		System.out.println(childId);
		Thread.sleep(2000);
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	
		

	}

}
