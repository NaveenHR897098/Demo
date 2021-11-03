package WebElementProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllignmentOfUNAndPWD {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com"); 
		driver.manage().window().maximize();
		int startXOfUnTF = driver.findElement(By.id("username")).getLocation().getX();
		int startXOfPwdTF = driver.findElement(By.name("pwd")).getLocation().getX();
		if (startXOfUnTF == startXOfPwdTF) 
		{
			System.out.println("Passed : Same Allignment");
		}else 
		{
			System.out.println("Failed! : NOT Same Allignment");
		}
		driver.quit();
	}

}