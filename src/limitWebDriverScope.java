import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitWebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// code to find links only in footer:

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// code to find links only in footer column

		WebElement columndriver = footerdriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));

		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// opening links dynamically

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			String clickandenter = Keys.chord(Keys.COMMAND, Keys.ENTER);

			Thread.sleep(2000);

			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickandenter);

			Thread.sleep(2000);
		}
		
		// getting title of each window

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> id = ids.iterator();

		while (id.hasNext()) {

			driver.switchTo().window(id.next());
			System.out.println(driver.getTitle());
		}

	}

}
