import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demoEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver", "msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		driver.close();

	}

}
