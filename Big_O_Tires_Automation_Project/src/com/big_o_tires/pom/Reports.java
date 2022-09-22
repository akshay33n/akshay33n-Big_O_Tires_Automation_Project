package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports extends BasePage
{
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement clickOnReports;
	
	@FindBy(xpath="//span[.='New Report']")
	private WebElement clickONCreateReports;
	
	@FindBy(id="configureReportParametersButton")
	private WebElement clickOnCPB;
	
	@FindBy(id="applyReportConfiguration")
	private WebElement arc;
	
	public Reports(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
public void clickonTasks()
{
	clickOnReports.click();
}
public void clickoncreatereports()
{
	clickONCreateReports.click();
}
public void clickoncpb()
{
	clickOnCPB.click();
}
public void clickonapplyreportconfigurration()
{
	arc.click();
}
}

