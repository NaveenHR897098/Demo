package WebElementProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Submit {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("asdf");
Thread.sleep(3000);
driver.findElement(By.id("username")).submit();
Thread.sleep(1500);
driver.quit();
}
}