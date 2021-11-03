package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
public class DontLook 
{
	public static void LookHere(WebDriver driver)
	{
		driver.get("https://www.hotstar.com/in");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
		public static void main(String [] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
			System.setProperty("webdriver.IE.driver", "./driver/IEDriver.exe");
			WebDriver driver= new ChromeDriver();
			WebDriver driver1 = new FirefoxDriver();
			WebDriver driver2 = new OperaDriver();
			WebDriver driver4 = new InternetExplorerDriver();
			DontLook.LookHere(driver);
			DontLook.LookHere(driver1);
			DontLook.LookHere(driver2);
			DontLook.LookHere(driver4);
		}
}