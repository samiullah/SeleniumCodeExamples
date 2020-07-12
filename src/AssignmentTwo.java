import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		
		String url = "https://www.cleartrip.com/";


		
    	
		
		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title=\"Depart date\"]")).click();
		WebElement activeDate = driver.findElement(By.cssSelector(".ui-state-active"));
		activeDate.click();
		
		Thread.sleep(2000);
		
		WebElement adults = driver.findElement(By.id("Adults"));
		adults.click();
		Select s = new Select(adults);
		s.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement children = driver.findElement(By.xpath("//select[@id=\"Childrens\"]"));
		children.click();
		Select c = new Select(children);
		c.selectByValue("4");
		
		Thread.sleep(2000);
		
		
		WebElement Infants = driver.findElement(By.xpath("//select[@id=\"Infants\"]"));
		Infants.click();
		Select i = new Select(Infants);
		i.selectByValue("2");
		Thread.sleep(4000);
		
		WebElement moreOption = driver.findElement(By.xpath("//a[@id=\"MoreOptionsLink\"]"));
		moreOption.click();
		Thread.sleep(2000);
		
		WebElement airline = driver.findElement(By.xpath("//input[@name=\"airline\"]"));
		airline.sendKeys("Indigo");
		Thread.sleep(2000);
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id=\"SearchBtn\"]"));
		searchButton.click();
		
		Thread.sleep(2000);
		String errorMessage = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(errorMessage);
			
		
		driver.quit();		

	}

}
