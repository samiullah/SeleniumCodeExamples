import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_autoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");	
		driver.findElement(By.xpath("//input[@id=\"FromSector_show\"]")).clear();
     	Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@id=\"FromSector_show\"]")).sendKeys("MAA");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"FromSector_show\"]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id=\"Editbox13_show\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"Editbox13_show\"]")).sendKeys("DEL");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"Editbox13_show\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"ddate\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"active-date\"]")).click();
		
		Thread.sleep(2000);
		
//		WebElement returndate = driver.findElement(By.xpath("//*[@id=\"rdate\"]"));
//		System.out.println(returndate.isSelected());
//		
//		driver.findElement(By.xpath("//*[@id=\"rdatelbl\"]")).
	//	System.out.println(driver.findElement(By.xpath("//*[@id=\"rdatelbl\"]")).getAttribute("style"));
		
	//	Thread.sleep(2000);
		//driver.quit();
		
		
		
		
		
		
		driver.quit();
	}

	}


