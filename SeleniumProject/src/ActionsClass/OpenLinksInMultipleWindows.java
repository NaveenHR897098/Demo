package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinksInMultipleWindows {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/blog/");

List<WebElement> navBar = driver.findElements(By.xpath("//div[@id='main_navbar']//li"));
Thread.sleep(5000);
Actions action = new Actions(driver);
action.keyDown(Keys.CONTROL);
//click on each element in navigation bar

for(WebElement ele:navBar)
{
action.click(ele);
}
action.keyUp(Keys.CONTROL);
action.perform();
driver.quit();
}

}