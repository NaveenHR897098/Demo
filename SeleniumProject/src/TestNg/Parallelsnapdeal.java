package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelsnapdeal {
@Test
public void nav1()
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.snapdeal.com/");
driver.quit();
}
}
