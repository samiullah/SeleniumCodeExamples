import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//due to slow network
		Thread.sleep(2000);
		
		WebElement option = driver.findElement(By.id("checkBoxOption2"));
		
		// Storing the option label in variable
		String optionText = option.getText();
		
		System.out.println(optionText);
		
		option.click();
		
		//due to slow network
		Thread.sleep(2000);
		
		WebElement se = driver.findElement(By.id("dropdown-class-example"));
		
		
		 //se.click();
		Select s = new Select(se);
		
		//due to slow network
		Thread.sleep(4000);
		// selecting the optiontext
		s.selectByVisibleText(optionText);
		
		
		//due to slow network
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys(optionText);
		
		driver.findElement(By.id("alertbtn")).click();
		//due to slow network
		Thread.sleep(2000);
		
		String alertText = driver.switchTo().alert().getText();
		
		if(alertText.contains(optionText)) {
			System.out.println("Test case passes");
		}
		
		else {
			System.out.println("test case fail");
		}
		
		
		
		
		

	}

}
