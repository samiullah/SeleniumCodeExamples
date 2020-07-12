import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class demo_staticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement s = driver.findElement(By.id("dropdown-class-example"));
		
		Select select = new Select(s);
		
		//select.selectByIndex(2);
		//select.selectByVisibleText("Option1");
		select.selectByValue("option3");

		
	
		
		driver.quit();
		

	}

}
