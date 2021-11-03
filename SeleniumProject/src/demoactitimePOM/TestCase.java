package demoactitimePOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsernameTextField().sendKeys("admin");
        loginPage.getPasswordTextField().sendKeys("manager");
        loginPage.getLoginButton().click();
        loginPage.getTasks().click();
        loginPage.getReports().click();
        loginPage.getUsers().click();
        loginPage.getLogout().click();
        System.out.println(loginPage.getPleaseIdentifyYourSelf().getText());
        System.out.println(loginPage.getAtproductname().getText());
        System.out.println(loginPage.getKeeplogin().getText());
        System.out.println(loginPage.getPasswordrecovery().getText());
        System.out.println(loginPage.getActitime().getText());
        System.out.println(loginPage.getActitimeinc().getText());
        driver.quit();
	}

}
