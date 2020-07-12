import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class demo_dyanamicDropdowns2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
//		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
////		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
//		
//		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value=\"MAA\"]")).click();
//		//Thread.sleep(2000);
////		driver.findElement(By.xpath("(//a[@value=\"BLR\"])[2]")).click();
//		
//		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"BLR\"]")).click();
		
		Thread.sleep(2000);
		
        WebElement friends = driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily"));
        //System.out.println(friends.isSelected());
        
        Assert.assertFalse(friends.isSelected());
        
        
		
		//friends.click();
		
		//System.out.println(friends.isSelected());
		
		Assert.assertTrue(friends.isSelected());
		
		Thread.sleep(2000);
		
		
		System.out.println(	driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
	
		
		driver.quit();
		

}
}
