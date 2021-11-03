package ScreenShotOfWebPage;
import java.io.File;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShotOfWebpage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String timeStamp= LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshots/"+timeStamp+"ActiTime.png");
		tempFile.renameTo(destFile);
		driver.quit();
	}
}


//another way to get time
//Date date = new Date();
//System.out.println(date);