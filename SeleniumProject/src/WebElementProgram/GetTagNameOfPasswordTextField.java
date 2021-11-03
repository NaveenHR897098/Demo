package WebElementProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTagNameOfPasswordTextField {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
String tagName=driver.findElement(By.name("pwd")).getTagName();
System.out.println(tagName);
driver.quit();
}
}