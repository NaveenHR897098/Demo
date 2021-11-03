package DriverWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIdenitifactionLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("naveen");
		driver.findElement(By.name("pwd")).sendKeys("1234");
	}

}
