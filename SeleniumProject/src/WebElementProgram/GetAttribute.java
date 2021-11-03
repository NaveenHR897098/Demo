package WebElementProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute 
{
	public static void main(String[] args)
	{
		String expectedTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String actualtoolTipTitle =driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		System.out.println(actualtoolTipTitle);
		if(expectedTiptitle.equals(actualtoolTipTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("falied");
		}
		driver.quit();
	}
}