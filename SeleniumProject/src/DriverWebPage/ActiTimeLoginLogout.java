package DriverWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActiTimeLoginLogout 
{
	public static void main(String[] args) throws InterruptedException
	{
		String expectedTitle="actiTIME - Enter Time-Track";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);
		String actualTitle=driver.getTitle();
		System.out.println("ExpectedTitle is"+expectedTitle);
		System.out.println("ActualTitle is"+actualTitle);
		if(actualTitle.equals(expectedTitle)) 
		{
			System.out.println(driver.getTitle());
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.quit();
	}
}