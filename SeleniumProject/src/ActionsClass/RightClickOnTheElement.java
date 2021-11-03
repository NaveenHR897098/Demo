package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnTheElement {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rigthclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action = new Actions(driver);
		action.contextClick(rigthclick).perform();
		Thread.sleep(10000);
		driver.quit();
	}

}
