import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("farooqa.gulshan");
		driver.findElement(By.cssSelector("#email")).sendKeys("farooqa.gulshan");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("passc0de");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.findElement(By.name("pass")).sendKeys("passc0de");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		

	}

}
