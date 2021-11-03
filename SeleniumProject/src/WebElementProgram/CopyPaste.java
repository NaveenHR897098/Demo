package WebElementProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
WebElement userNameTextField=driver.findElement(By.id("usename"));
userNameTextField.sendKeys("manager");

userNameTextField.sendKeys(Keys.CONTROL+"a");
userNameTextField.sendKeys(Keys.CONTROL+"c");

WebElement userNamePwdField=driver.findElement(By.name("pwd"));
userNamePwdField.sendKeys(Keys.CONTROL+"v");

//driver.quit();
}

}