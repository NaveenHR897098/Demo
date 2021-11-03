package JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollUsingByMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//move the scroll bar downwards 500 pixels
		js.executeScript("window.scrollBy(0,500)");
		//move the scroll bar upwards 500 pixels
		js.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(2000);
		//move the scroll bar towards right 500 pixels
		js.executeScript("window.scrollBy(500,0)");
		//move the scroll bar towards left 500 pixels
		js.executeScript("window.scrollBy(-500,0)");
		driver.quit();
	}
}