package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement add1 = driver.findElement(By.id("add"));
		WebElement sub = driver.findElement(By.id("minus"));
		Actions action = new Actions(driver);
		action.doubleClick(add1).perform();
		action.doubleClick(add1).perform();
		action.doubleClick(sub).perform();
		driver.quit();
	}

}