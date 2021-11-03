package WebElementProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsSelectedAndIsDisplayed 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
WebElement checkBox = driver.findElement(By.name("remember"));
checkBox.click();
Thread.sleep(2000);
boolean flag1= checkBox.isDisplayed();
boolean flag2= checkBox.isSelected();
if(flag1 && flag2)
{
System.out.println("element is displayed and checked,\ntest case is passed");
}
else
{
System.out.println("test case is failed");
}
driver.quit();
}
}