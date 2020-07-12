import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffCSSregex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*=\"Sign\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("efrferf");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Dedede");
		driver.findElement(By.cssSelector("input[title*='Sign']")).click();
	    Thread.sleep(3000);
		
		driver.close();
	}

}
