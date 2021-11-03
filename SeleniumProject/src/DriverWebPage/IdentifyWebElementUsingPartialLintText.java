package DriverWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdentifyWebElementUsingPartialLintText 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Forgot your")).click();
	driver.quit();
	}
}