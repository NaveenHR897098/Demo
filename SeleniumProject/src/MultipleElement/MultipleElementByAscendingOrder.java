package MultipleElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleElementByAscendingOrder
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13407");
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> countryName = driver.findElements(By.xpath("//table[@class='fc-ranking-list-full_rankingTable__1u4hs']/tbody/tr[*]/td[3]"));
		for(WebElement names:countryName)
			{
				list.add(names.getText());
			}
		Collections.sort(list);
		for(String titles:list)
			{
				System.out.println(titles);
			}

		driver.quit();
	}

}