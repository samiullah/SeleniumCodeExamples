
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		

		String prod[] = { "Cucumber", "Brocolli", "Beetroot" };
		addProducts(driver, prod);
		checkOut(driver);

		driver.quit();

	}

	public static  void addProducts(WebDriver driver, String[] prod) throws InterruptedException {
		List<WebElement> products = driver.findElements(By.className("product-name"));
		List l = Arrays.asList(prod);
		System.out.println(l);

		for (int i = 0; i < products.size(); i++) {
			String s[] = products.get(i).getText().split("-");
			String formatted = s[0].trim();
			System.out.println(formatted);
			System.out.println(s);

			if (l.contains(formatted)) {
				// System.out.println(s.contains("Cucumber"));
				driver.findElements(By.xpath("//*[@class=\"product-action\"]/button")).get(i).click();

			}

		}

		Thread.sleep(3000);

	}
	
	public static void checkOut(WebDriver driver) {
		
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"cart-preview active\"]/div[2]/button")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
		
		
		
	}
	
	

}
