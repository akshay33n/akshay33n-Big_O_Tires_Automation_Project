package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class BasePage 
{
public WebDriver driver;

public BasePage(WebDriver driver)
{
	this.driver=driver;
}
public void VerifyTitle(String etitle)
{
String atitle = driver.getTitle();
Assert.assertEquals(atitle, etitle);
}
}
