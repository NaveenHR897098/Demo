package GetThePosition;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureCurrentWindowId {
	public static void main(String[] args) throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		URL url = new URL("https://youtube.com");
		driver.navigate().to(url);
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.quit();
	}
}