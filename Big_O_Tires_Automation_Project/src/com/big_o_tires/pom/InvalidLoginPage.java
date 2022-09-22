package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidLoginPage extends BasePage
{
@FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
private WebElement errorMsg;
		
	public InvalidLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void VerifyErrorMsg()
	{
		Assert.assertTrue(errorMsg.isDisplayed());
	}


}
