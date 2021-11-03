package GetThePosition;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWindow
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentWindowId=driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String ids:allWindowIds)
		{
			driver.switchTo().window(ids);
			driver.close();
		}
	}

}
