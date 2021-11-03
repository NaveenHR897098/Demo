package TestNg;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowser {
	@Parameters("browser")
	@Test
	public void cross(String browserName) {
		  WebDriver driver=null;
		if(browserName.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		 driver = new FirefoxDriver();
		}
		/*else if(browserName.equals("edge")) {
			System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		}*/
		else
		{
			throw new NoSuchSessionException("browser is not allowed");
		}
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		Actions action = new Actions(driver);
		action.click(logout).perform();
		driver.quit();
	}
}