package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageVtiger {
public HomePageVtiger(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
	@FindBy(id="appnavigator")private WebElement navigator;
	@FindBy(xpath="//span[text()=' MARKETING']")private WebElement market;	
	@FindBy(xpath="//span[text()=' Campaigns']")private WebElement campaigns;
	
	public WebElement getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(WebElement campaigns) {
		this.campaigns = campaigns;
	}
	public WebElement getMarket() {
		return market;
	}
	public void setMarket(WebElement market) {
		this.market = market;
	}
	public WebElement getNavigator() {
		return navigator;
	}
	public void setNavigator(WebElement navigator) {
		this.navigator = navigator;
	}
	
	@FindBy(xpath="//a[text()='Sign Out']")private WebElement sigout;
	@FindBy(xpath="//span[@class='fa fa-user']")private WebElement rigth;
	
	public WebElement getRigth() {
		return rigth;
	}
	public void setRigth(WebElement rigth) {
		this.rigth = rigth;
	}
	
	public WebElement getSigout() {
		return sigout;
	}
	public void setSigout(WebElement sigout) {
		this.sigout = sigout;
	}

	public Actions getActions(WebDriver driver)
	{
		return new Actions(driver);
	}
	public void openCampaign(WebDriver driver)
	{
		navigator.click();
		getActions(driver).moveToElement(market).perform();
		getActions(driver).moveToElement(campaigns).click().perform();
	}
	
	public void signout()
	{
		rigth.click();
		sigout.click();
	}
}
