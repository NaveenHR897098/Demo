package GetThePosition;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class closeMultipleOneByOne 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windowIds = driver.getWindowHandles();
		for(String ids:windowIds)
		{
			driver.switchTo().window(ids);
			driver.quit();
		}
	}
}