package DriverWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColorUsingWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement color=driver.findElement(By.xpath("/a[@id='loginButton']"));
		color.getCssValue("border-top-color");
		System.out.println(color);
		WebElement font=driver.findElement(By.xpath("/a[@id='loginButton']"));
		font.getCssValue("font-family");
		System.out.println(font);
		WebElement align =driver.findElement(By.xpath("/a[@id='loginButton']"));
		align.getCssValue("text-align");
		System.out.println(align);
		driver.quit();
	}

}
