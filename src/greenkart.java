
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		List<WebElement> products= driver.findElements(By.className("product-name"));
		
		String prod[]= {"Cucumber","Brocolli","Beetroot"};
		
		List l = Arrays.asList(prod);
		System.out.println(l);
		
		
		
		for(int i=0; i< products.size();i++) {
			String s[] = products.get(i).getText().split("-");
			String formatted = s[0].trim();
			System.out.println(formatted);
			System.out.println(s);
			
			
			if(l.contains(formatted)) {
				//System.out.println(s.contains("Cucumber"));
                driver.findElements(By.xpath("//*[@class=\"product-action\"]/button")).get(i).click();
               
				
				
			}
			
			
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
