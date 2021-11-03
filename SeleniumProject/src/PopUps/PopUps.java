package PopUps;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PopUps 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://licindia.in/Home/");
		driver.findElement(By.xpath("//b[text()='Online Loan']")).click();
		driver.findElement(By.xpath("//b[text()='Pay Direct (Without login)']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String expectedTitle="Life Insurance Corporation of India";
		String windowid = driver.getWindowHandle();
		Set<String> windowIds = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowIds);
		list.remove(windowid);
		for(String ids:list)
		{
			driver.switchTo().window(ids);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println("verifed title");
			}
			else
			{
				System.out.println("not verifed title");
			}
			driver.quit();
		}

	}

}
