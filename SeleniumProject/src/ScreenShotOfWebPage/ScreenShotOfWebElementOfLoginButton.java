package ScreenShotOfWebPage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShotOfWebElementOfLoginButton 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		File tempFile = driver.findElement(By.xpath("//div[text()='Login ']")).getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshots/"+timeStamp+"ActiTimeLogin.png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();
	}
}