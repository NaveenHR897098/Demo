package DriverWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FilpKartMobiles 
{
	public static void main(String[] args) //throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//div[text()='realme C21Y (Cross Black, 64 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).click();
		
		//driver.findElement(By.xpath("//input[@name='q']")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(5000);
	}
}
