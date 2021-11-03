package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source1 = driver.findElement(By.id("box6"));
		WebElement dest1 = driver.findElement(By.id("box106"));
		WebElement source2 = driver.findElement(By.id("box7"));
		WebElement dest2 = driver.findElement(By.id("box107"));
		WebElement source3 = driver.findElement(By.id("box1"));
		WebElement dest3 = driver.findElement(By.id("box101"));
		WebElement source4 = driver.findElement(By.id("box4"));
		WebElement dest4 = driver.findElement(By.id("box104"));
		WebElement source5 = driver.findElement(By.id("box5"));
		WebElement dest5 = driver.findElement(By.id("box105"));
		WebElement source6 = driver.findElement(By.id("box2"));
		WebElement dest6 = driver.findElement(By.id("box102"));
		WebElement source7 = driver.findElement(By.id("box3"));
		WebElement dest7 = driver.findElement(By.id("box103"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source1, dest1).perform();
		action.dragAndDrop(source2, dest2).perform();
		action.dragAndDrop(source3, dest3).perform();
		action.dragAndDrop(source4, dest4).perform();
		action.dragAndDrop(source5, dest5).perform();
		action.dragAndDrop(source6, dest6).perform();
		action.dragAndDrop(source7, dest7).perform();
		driver.quit();
		
	}

}
