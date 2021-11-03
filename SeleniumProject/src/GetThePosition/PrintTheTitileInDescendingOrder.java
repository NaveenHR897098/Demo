package GetThePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintTheTitileInDescendingOrder 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String>allWindowIDs=driver.getWindowHandles();
		ArrayList<String>list=new ArrayList<String>();
		for(String ids:allWindowIDs)
		{
			driver.switchTo().window(ids);
			list.add(driver.getTitle());
		}
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		for(String title:list)
		{
			System.out.println(title);
		}
		driver.quit();
	}
}