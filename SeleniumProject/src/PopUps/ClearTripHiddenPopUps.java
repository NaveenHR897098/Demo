package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripHiddenPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender ']")).click();
		driver.findElement(By.xpath("//div[text()='October 2021']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='22']")).click();
		//driver.quit();

	}

}
