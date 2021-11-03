package DriverWebPage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToPrintWindowInAscendingOrder
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String>windonIds=driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		for(String Id:windonIds)
		{
			driver.switchTo().window(Id);
			list.add(driver.getTitle());
		}
		System.out.println(list);
		Collections.sort(list);
		for(String title:list)
		{
			System.out.println(title);
		}
	driver.quit();
	}
}