package WebElementProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendKeysForKeyBoardEnter {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
WebElement userNameTextField=driver.findElement(By.id("username"));
userNameTextField.sendKeys("admin");
WebElement passwordTextField=driver.findElement(By.name("pwd"));
passwordTextField.sendKeys("manager");
passwordTextField.sendKeys(Keys.ENTER);
driver.quit();
}
}