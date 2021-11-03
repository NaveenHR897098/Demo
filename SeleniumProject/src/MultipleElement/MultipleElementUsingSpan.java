package MultipleElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleElementUsingSpan
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13407");
		List<WebElement> countryName = driver.findElements(By.xpath("//span[@class='d-none d-lg-block']"));
		for(WebElement names:countryName)
		{
			System.out.println(names.getText());
		}
		driver.quit();
	}

}
