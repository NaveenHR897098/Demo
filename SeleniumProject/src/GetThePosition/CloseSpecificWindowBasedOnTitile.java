package GetThePosition;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseSpecificWindowBasedOnTitile
{
	public static void main(String[] args) 
	{
		String expectedTitle="Cognizant";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windowIds = driver.getWindowHandles();
		for(String ids:windowIds)
		{
			driver.switchTo().window(ids);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle))
			{
				driver.close();
				break;
			}
		}
	}
}