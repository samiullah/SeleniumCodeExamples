package nykaatest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykaaUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.nykaa.com/");
		
		WebElement skin = driver.findElement(By.xpath("//li/a[contains(text(),\"skin\")]"));
		
		Actions a = new Actions(driver);

         a.moveToElement(skin);
         a.build().perform();
         
        Thread.sleep(2000);
         
        WebElement night = driver.findElement(By.xpath("//li/a[contains(text(),\"Night Cream\")] [@href=\"/skin/moisturizers/night-cream/c/8395?root=nav_3\"]"));
        a.moveToElement(night);
        a.click().build().perform();
		
		

	}

}
