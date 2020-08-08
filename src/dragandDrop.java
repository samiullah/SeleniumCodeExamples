import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		WebElement x = driver.findElement(By.className("demo-frame"));
		
		Thread.sleep(2000);
		driver.switchTo().frame(x);
		Thread.sleep(2000);
		WebElement z = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    
	    WebElement target = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	    Thread.sleep(2000);
	    
	    action.dragAndDrop(z, target).build().perform();
	    driver.switchTo().defaultContent();

	    
		
		String y = z.getText();
		
		
		System.out.println(y);
		

	}

}
