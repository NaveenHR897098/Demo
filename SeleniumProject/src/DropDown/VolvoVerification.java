package DropDown;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class VolvoVerification {
	public static void main(String[] args) {
		String title= "Volvo";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropDown= driver.findElement(By.name("cars"));
		Select select= new Select(dropDown);
		List<WebElement> allElement = select.getOptions();
		ArrayList<String> allTitle= new ArrayList<String>();
		for(WebElement element:allElement) {
			allTitle.add(element.getText());
		}boolean flag= allTitle.contains(title);
		if(flag) {
			System.out.println("Test case is pass, Volvo is present in the dropdown list");
		}else {
			System.out.println("Test case is fail, Volvo is not present in dropdown list");
		}driver.quit();
	}	
}

