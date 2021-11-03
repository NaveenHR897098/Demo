package vtigerLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VloginPage {
	public VloginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")	private WebElement usernameTextField;
	@FindBy(id="password") private WebElement passwordTextField;
	@FindBy(xpath="//button[text()='Sign in']") private WebElement loginButton;
	
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
	public void login(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	
}
