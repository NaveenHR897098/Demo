package DateSelecter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDate {
public SelectDate(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//table[@class=' table-condensed']/tbody/tr[5]/td[7]")
	private WebElement date;
	public WebElement getDate() {
		return date;
	}
	public void setDate(WebElement date) {
		this.date = date;
	}
	public void datesel()
	{
		date.click();
	}
}
