package WebElementProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendKeysForKeyBoardAction {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(1000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@id='loginButton']")).sendKeys(Keys.ENTER);

Thread.sleep(2000);
driver.quit();
}
}