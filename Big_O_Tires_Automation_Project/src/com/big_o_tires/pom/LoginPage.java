package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="username")
private WebElement Username;
@FindBy(name="pwd")
private WebElement Password;
@FindBy(id="loginButton")
private WebElement LoginButton;

public void SetUserName(String un)
{
	Username.sendKeys(un);
}
public void SetPassword(String pw)
{
	Password.sendKeys(pw);
}
public void ClickonLoginButton()
{
LoginButton.click();
}
}

