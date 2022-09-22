package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Versions extends BasePage
{
@FindBy(xpath="//nobr[text()='actiTIME 2016.3']")
private WebElement version;

	public Versions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
public void Verifyversion(String eversion)
{
String aversion = version.getText();
Assert.assertEquals(aversion, eversion);
}
	}


