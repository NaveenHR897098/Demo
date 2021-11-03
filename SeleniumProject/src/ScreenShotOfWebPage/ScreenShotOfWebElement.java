package ScreenShotOfWebPage;
import java.io.File;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShotOfWebElement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		File tempFile = driver.findElement(By.xpath("//div[@class='bot_column']")).getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		File destFILE = new File("./screenshots/"+timestamp+"Swag Robot.png");
		tempFile.renameTo(destFILE);
		driver.quit();
	}
}