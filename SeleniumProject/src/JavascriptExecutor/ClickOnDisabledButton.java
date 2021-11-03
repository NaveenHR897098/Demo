package JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClickOnDisabledButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		Thread.sleep(2200);
		driver.findElement(By.xpath("//a[text()= ' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		Thread.sleep(2200);
		WebElement disabledLink= driver.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", disabledLink);
		Thread.sleep(2200);
		driver.quit(); 
	}
}
