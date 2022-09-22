package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckBox extends BasePage
{
@FindBy(id="keepLoggedInCheckBox")
private WebElement Checkbox;	

	public CheckBox(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void ClickOnCheckBox()
	{
		Checkbox.click();
		Assert.assertTrue(Checkbox.isSelected());
	}

}
