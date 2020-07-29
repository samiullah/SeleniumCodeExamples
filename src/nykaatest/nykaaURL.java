package nykaatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class nykaaURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeU);
		
		driver.get("https://www.nykaa.com/");
		String a = driver.getCurrentUrl();
		
		driver.findElement(By.xpath("//*[@class=\"AccountText\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"emailMobile\"]")).sendKeys("samireshi003@gmail.com");
		String s = driver.getCurrentUrl();		
		Assert.assertEquals(s, "https://www.nykaa.com/auth/verify?ptype=auth");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(1000);
		
//		samireshi002+randomgen+@gmail.com
		String username = "Sami3";
		
		driver.findElement(By.cssSelector("#userName")).sendKeys(username);
		//driver.findElement(By.name("customerEmail")).sendKeys("samireshi002@gmail.com");
		driver.findElement(By.cssSelector("#secure-input")).sendKeys("Passc0de");
		driver.findElement(By.xpath("//button[contains(text(),\"register\")]")).click();
		
		Thread.sleep(5000);
	
		boolean b= driver.findElement(By.xpath("//span[@class=\"AccountText\"]/span")).getText().contains(username);
		
		Assert.assertEquals(b, true);
		
		
//		driver.findElement(By.xpath("//a[contains(text(),\"categories\")]")).click();
//		
//		Actions action = new Actions(driver);
//		
//		 action.perform();
//		WebElement el = driver.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[2]/a"));
//		action.moveToElement(el);
		
		
		
		
		
		
		
		

	}

}
