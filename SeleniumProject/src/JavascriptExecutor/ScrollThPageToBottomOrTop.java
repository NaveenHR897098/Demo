package JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollThPageToBottomOrTop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("history.go(0)");//refresh the page
		driver.quit();
	}
}