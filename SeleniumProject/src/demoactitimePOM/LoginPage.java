package demoactitimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(id="headerContainer")
	private WebElement PleaseIdentifyYourSelf;
	
	@FindBy(className="atProductName")
	private WebElement atproductname;

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepligged;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement keeplogin;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement passwordrecovery;
	
	@FindBy(xpath="//nobr[text()='actiTIME 2020 Online']")
	private WebElement actitime;
	
	@FindBy(xpath="//a[text()='actiTIME Inc.']")
	private WebElement actitimeinc;
	
	@FindBy(xpath="//a[@class='content selected tt']")
	private WebElement content;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement reports;
	
	public WebElement getTasks() {
		return tasks;
	}

	public void setTasks(WebElement tasks) {
		this.tasks = tasks;
	}

	public WebElement getReports() {
		return reports;
	}

	public void setReports(WebElement reports) {
		this.reports = reports;
	}

	public WebElement getUsers() {
		return users;
	}

	public void setUsers(WebElement users) {
		this.users = users;
	}
	@FindBy(xpath="//a[@class='content users']")
	private WebElement users;
	
	public WebElement getContent() {
		return content;
	}

	public void setContent(WebElement content) {
		this.content = content;
	}

	public WebElement getActitimeinc() {
		return actitimeinc;
	}

	public void setActitimeinc(WebElement actitimeinc) {
		this.actitimeinc = actitimeinc;
	}

	public WebElement getActitime() {
		return actitime;
	}

	public void setActitime(WebElement actitime) {
		this.actitime = actitime;
	}

	public WebElement getPasswordrecovery() {
		return passwordrecovery;
	}

	public void setPasswordrecovery(WebElement passwordrecovery) {
		this.passwordrecovery = passwordrecovery;
	}

	public WebElement getKeeplogin() {
		return keeplogin;
	}

	public void setKeeplogin(WebElement keeplogin) {
		this.keeplogin = keeplogin;
	}

	public WebElement getKeepligged() {
		return keepligged;
	}

	public void setKeepligged(WebElement keepligged) {
		this.keepligged = keepligged;
	}

	public WebElement getAtproductname() {
		return atproductname;
	}

	public void setAtproductname(WebElement atproductname) {
		this.atproductname = atproductname;
	}

	public WebElement getPleaseIdentifyYourSelf() {
		return PleaseIdentifyYourSelf;
	}

	public void setPleaseIdentifyYourSelf(WebElement pleaseIdentifyYourSelf) {
		PleaseIdentifyYourSelf = pleaseIdentifyYourSelf;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
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

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}
	
	public void login()
	{
		usernameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
		loginButton.click();
	}
	
	public void login(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}      

}
