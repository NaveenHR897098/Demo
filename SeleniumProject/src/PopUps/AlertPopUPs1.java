package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUPs1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.marimallappawomenscollege.org/contactus.php");
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.findElement(By.name("Send")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.quit();

	}

}
