package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.pom.HomePage;
import com.big_o_tires.pom.LoginPage;

public class Verify_HomePage_Title extends BaseTest
{
@Test
public void VerifyHomePage()
{
	LoginPage l1=new LoginPage(driver);
	l1.SetUserName("admin");
	l1.SetPassword("manager");
	l1.ClickonLoginButton();

HomePage h1 = new HomePage(driver);
h1.VerifyTitle("actiTIME - Enter Time-Track");
h1.ClickonLogoutButton();
}
}
