package vtigerLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Campaign.AddCampaign;
import CampaignDemo.CampaignDemoDetails;
import CampaignDetails.CampaignDetails1;
import DateSelecter.SelectDate;
import HomePage.HomePageVtiger;
import PropertyUtils.PropetyUtil;
public class TestCasevtiger 
{
	public static void main(String[] args) throws Throwable 
	{
		String filepath="./resource/vtiger.properties";
		PropetyUtil proper = new PropetyUtil();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(proper.getPropUtil(filepath, "url"));
		VloginPage loginpage = new VloginPage(driver);
		loginpage.getUsernameTextField().clear();
		loginpage.getPasswordTextField().clear();
		loginpage.login(proper.getPropUtil(filepath, "username"),proper.getPropUtil(filepath, "password"));
		HomePageVtiger home = new HomePageVtiger(driver);
		home.openCampaign(driver);
		AddCampaign camp = new AddCampaign(driver);
		camp.addcamp();
		CampaignDetails1 campdet = new CampaignDetails1(driver);
		campdet.clickcal(proper.getPropUtil(filepath, "CampaignName"));
		SelectDate seldate = new SelectDate(driver);
		seldate.datesel();
		campdet.save();
		CampaignDemoDetails Campdemo = new CampaignDemoDetails(driver);
		Campdemo.campname(proper.getPropUtil(filepath, "CampaignName"));
		home.signout();
		driver.quit();
	}
}
