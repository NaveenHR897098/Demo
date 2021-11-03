package DemoVtigerPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vtigerLoginPage {
	public vtigerLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement loginButton;
	
}
