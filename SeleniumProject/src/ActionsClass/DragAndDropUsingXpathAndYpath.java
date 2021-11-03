package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingXpathAndYpath {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/draggable/");

WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame);
Actions action = new Actions(driver);
WebElement box = driver.findElement(By.id("draggable"));
action.dragAndDropBy(box, 200,100).perform();

driver.switchTo().defaultContent();
System.out.println(driver.findElement(By.xpath("//h1[@class='entry-title']")).getText());
driver.quit();

}

}