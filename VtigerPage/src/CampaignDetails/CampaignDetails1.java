package CampaignDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetails1 {
public CampaignDetails1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	@FindBy(name="campaignname")private WebElement campname;
	@FindBy(xpath="//div[@class='input-group inputElement']/descendant::i[@class='fa fa-calendar ']")
	private WebElement group;
	@FindBy(xpath="//button[text()='Save']")private WebElement save;
	
	public WebElement getSave() {
		return save;
	}
	public void setSave(WebElement save) {
		this.save = save;
	}
	public WebElement getGroup() {
		return group;
	}
	public void setGroup(WebElement group) {
		this.group = group;
	}
	public WebElement getCampname() {
		return campname;
	}
	public void setCampname(WebElement campname) {
		this.campname = campname;
	}
	
	public void clickcal(String CampaignName)
	{
		campname.sendKeys(CampaignName);
		group.click();
	}
	
	public void save()
	{
		save.click();
	}
}
