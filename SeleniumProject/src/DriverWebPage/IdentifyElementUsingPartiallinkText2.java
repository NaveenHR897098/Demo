package DriverWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdentifyElementUsingPartiallinkText2 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Forgotten password?")).click();
	driver.quit();
	}
}