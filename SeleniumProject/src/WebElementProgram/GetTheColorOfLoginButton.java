package WebElementProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheColorOfLoginButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String color = driver.findElement(By.xpath("//a[@id='loginButton']")).getCssValue("border-top-color");
		System.out.println(color);
		String color1 = driver.findElement(By.xpath("//a[@id='loginButton']")).getCssValue("font-family");		
		System.out.println(color1);
		String color11 = driver.findElement(By.xpath("//a[@id='loginButton']")).getCssValue("text-align");		
		System.out.println(color11);
		driver.quit();
	}

}
