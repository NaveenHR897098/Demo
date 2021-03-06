package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovingMouseOnTheElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/?format=websites");
		WebElement firststar = driver.findElement(By.id("rating1"));
		Actions action = new Actions(driver);
		action.moveToElement(firststar, 173, 0).click().perform();
		driver.quit();
	}

}
