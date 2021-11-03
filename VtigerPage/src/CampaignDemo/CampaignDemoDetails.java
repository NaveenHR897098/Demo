package CampaignDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDemoDetails {
public CampaignDemoDetails(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

	@FindBy(id="Campaigns_detailView_fieldValue_campaignname")
	private WebElement text;
	
	public WebElement getText() {
		return text;
	}
	public void setText(WebElement text) {
		this.text = text;
	}
	
	public void campname(String CampaignName)
	{
		String expectedText = CampaignName ;
		String actualText= text.getText();
		if(expectedText.equals(actualText))
		{
			System.out.println("test case pass and campaign name is matched");
			System.out.println(actualText);
		}
		else
		{
			System.out.println("test case is faled: campaign name is not matched	");
			System.out.println(expectedText);
		}
	}
}
