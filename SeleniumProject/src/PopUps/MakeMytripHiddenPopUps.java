package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytripHiddenPopUps {

	public static void main(String[] args) {
		String date="Sun Oct 24 2021";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sun Oct 24 2021']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+date+"']")).click();
		driver.quit();
	}

}