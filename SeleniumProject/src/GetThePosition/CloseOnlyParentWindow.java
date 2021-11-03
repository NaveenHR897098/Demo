package GetThePosition;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParentWindow
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.getWindowHandle();
		driver.close();
	}

}
