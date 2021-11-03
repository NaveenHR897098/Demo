package Campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCampaign 
{
	public AddCampaign(WebDriver driver) 
	{
	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addcamp;

	public WebElement getAddcamp() {
		return addcamp;
	}

	public void setAddcamp(WebElement addcamp) {
		this.addcamp = addcamp;
	}
	
	public void addcamp()
	{
		addcamp.click();
	}
}