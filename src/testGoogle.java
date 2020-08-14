import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGoogle {

	//private static final Set<String> String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.communications.gov.au/what-we-do/internet");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/p[2]/a[1]")).click();
		//driver.findElement(By.xpath("//a[@href=\"https://support.google.com/chrome/answer/6130773?hl=en\"]")).click();
		//System.out.println(driver.getTitle());
		
	//driver.getWindowHandles()
		
		Set<String>=driver.getWindowHandles();
		

	}

}
