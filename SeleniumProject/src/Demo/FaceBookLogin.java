package Demo;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FaceBookLogin
{
public static void main(String[] args) throws Throwable
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.cssSelector("Input[id='email']")).sendKeys("9535331723");
driver.findElement(By.cssSelector("Input[name='pass']")).sendKeys("Naveen.ammu6143");
driver.findElement(By.cssSelector("button[name='login']")).click();
//driver.findElement(By.cssSelector("div[class ='j83agx80 l9j0dhe7']")).click();
Robot robot= new Robot();
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
driver.findElement(By.cssSelector("div[class ='j83agx80 l9j0dhe7']")).click();
//driver.findElement(By.cssSelector("div[class ='oajrlxb2 gs1a9yip']")).click();
//driver.quit();
}
}