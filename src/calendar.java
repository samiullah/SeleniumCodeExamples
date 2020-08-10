import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(8000);
		
		driver.findElement(By.name("travel_date")).click();
		
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int count = driver.findElements(By.className("day")).size();
		
		System.out.println(count);
		
		for(int i = 0;i<count;i++)
		{
			String s = driver.findElements(By.className("day")).get(i).getText();
			System.out.println(s);
			if (s.equalsIgnoreCase("23"))
			{
				Thread.sleep(8000);
				driver.findElements(By.className("day")).get(i).click();
				break;
				
			}
			
		}
		
		
		Thread.sleep(8000);
		driver.quit();

	}

}
