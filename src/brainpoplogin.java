import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class brainpoplogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver.get("https://www.brainpop.com/");
		WebElement login = driver.findElement(By.xpath("//li[@id=\"login_button\"]/a"));
		boolean logtext = login.getText().contains("Log in");
		System.out.println(logtext);
		Assert.assertEquals(logtext, true, "Login button has text log in");
		login.click();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"login\"]"));
		username.sendKeys("qatest2020");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("brainp0p");
		
		Thread.sleep(2000);
		
		
		WebElement buttonlogin = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		buttonlogin.click();
		
		Thread.sleep(8000);
		
		WebElement samedeviceissue = driver.findElement(By.xpath("//div[@class=\"tired\"]"));
		boolean samedevicetext = samedeviceissue.getText().contains("Tired");
		if(samedevicetext == true)
		{
			driver.findElement(By.xpath("//button[@id=\"continue\"]")).click();
			Thread.sleep(8000);
		}
		
		//check logged in username is reflecting
		
		boolean correctuserlogged = driver.findElement(By.xpath("//a/span[contains(text(),\"qatest2020\")]")).getText().contains("qatest2020");
		
		Assert.assertEquals(correctuserlogged, true, "Correct user is logged in");
		
		Thread.sleep(2000);
		
		
		//logout
		driver.findElement(By.xpath("//a[@id=\"user_menu__BV_toggle_\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"logout_button\"]")).click();
		Thread.sleep(3000);
		
		
		// check wrong username case
		
		
		driver.quit();
		
		

	}

}
