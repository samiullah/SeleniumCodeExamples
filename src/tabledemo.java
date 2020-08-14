import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29074/eng-vs-pak-1st-test-pakistan-tour-of-england-2020");
		
		
		
		WebElement table = driver.findElement(By.xpath("(//div[@id=\"innings_1\"]/div[@class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"])[1]"));
		
		
		
		int x = table.findElements(By.xpath("(//div[@id=\"innings_1\"]/div[@class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"])[1]/div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/div[3]")).size();
		
		int temp = 0;
		
		for (int i = 0;i<x-2;i++) {
		String s = 	table.findElements(By.xpath("(//div[@id=\"innings_1\"]/div[@class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"])[1]/div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/div[3]")).get(i).getText();
			
		int n = Integer.parseInt(s);
	      
		temp = n+ temp;
	
		
		}
		
		System.out.println("***************");
		System.out.println("***************");
		System.out.println(temp);
		
		System.out.println("***************");
		
		String ss = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]")).getText();
		System.out.println(ss);
		

		
		
		String sl = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[15]/div[2]")).getText();
		System.out.println(sl);
		
		int score = temp + Integer.parseInt(ss);
		
		System.out.println(score);
		
		Assert.assertEquals(score, Integer.parseInt(sl));
		
		
		driver.quit();
		
		

	}

}
