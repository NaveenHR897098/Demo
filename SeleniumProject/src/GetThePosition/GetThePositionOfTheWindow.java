package GetThePosition;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetThePositionOfTheWindow
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Point point = new Point(2,50);
		driver.manage().window().setPosition(point);
		driver.quit();
	}
}
