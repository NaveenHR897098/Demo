package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promtPopUps
{
public static void main (String[] args)	
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("promtButton")).click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("NaveenHR");
	alert.accept();
	//alert.dismiss();
	//driver.quit();
}

}

