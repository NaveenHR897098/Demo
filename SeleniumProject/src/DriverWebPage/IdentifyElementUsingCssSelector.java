package DriverWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdentifyElementUsingCssSelector 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("Input#username")).sendKeys("admin");
	driver.findElement(By.cssSelector("Input[name='pwd']")).sendKeys("manager");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	Thread.sleep(5000);
	driver.quit();
	}
}