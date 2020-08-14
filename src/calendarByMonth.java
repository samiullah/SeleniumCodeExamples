import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarByMonth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(8000);
		
		driver.findElement(By.name("travel_date")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"datepicker-days\"]/table/thead/tr/th[@class=\"datepicker-switch\"]")).click();
		
		
		
		int count = driver.findElements(By.cssSelector(".month")).size();
		
		for(int i = 1;i<count;i++) {
			String mon = driver.findElements(By.cssSelector(".month")).get(i).getText();
			
			if(mon.equalsIgnoreCase("Sep")) {
				driver.findElements(By.cssSelector(".month")).get(i).click();
			}
			
			Thread.sleep(2000);
			
		}
		
		Thread.sleep(8000);

	}

}
