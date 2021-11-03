package WebElementProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTheSizeOfTheWebElement 
{
	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://demo.actitime.com/login.do");
	Dimension dimension = driver.findElement(By.id("username")).getSize();
	int heigthoftheusernametextfield=dimension.getHeight();
	int widthoftheusernametextfield=dimension.getWidth();
	System.out.println(heigthoftheusernametextfield);
	System.out.println(widthoftheusernametextfield);
	driver.quit();
	}
}
