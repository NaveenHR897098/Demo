package GetThePosition;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetSize {
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			Dimension dimension = new Dimension(500,100);
			driver.manage().window().setSize(dimension);
			driver.quit();
		}
	}
