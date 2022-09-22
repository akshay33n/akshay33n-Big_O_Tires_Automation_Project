package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement logoutButton;	
	
public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
public void ClickonLogoutButton()
{
	logoutButton.click();
}

}
