package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropImage {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

WebElement frame = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']"));
driver.switchTo().frame(frame);
Actions action = new Actions(driver);

WebElement source = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
WebElement destination = driver.findElement(By.id("trash"));
WebElement source1 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
WebElement destination1 = driver.findElement(By.id("trash"));
Thread.sleep(10000);
action.dragAndDrop(source, destination).perform();
action.dragAndDrop(source1, destination1).perform();

driver.quit();
}
}