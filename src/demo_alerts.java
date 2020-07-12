import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("sami");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("[id='name']")).sendKeys("sadsdmi");
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.quit();

	}

}
