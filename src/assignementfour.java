import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignementfour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href=\"/windows\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
		
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		Thread.sleep(2000);
		
		Iterator<String> id = ids.iterator();
		Thread.sleep(2000);
		
		String parentId = id.next();
		Thread.sleep(2000);
		
		String childId = id.next();
		
		driver.switchTo().window(childId);
		
		Thread.sleep(2000);
		
		String x = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(x);
		
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		String y = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(y);
		
		
		
		
		
		

	}

}
