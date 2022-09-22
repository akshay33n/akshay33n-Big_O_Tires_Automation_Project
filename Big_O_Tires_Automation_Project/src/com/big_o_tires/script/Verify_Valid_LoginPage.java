package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.pom.LoginPage;

public class Verify_Valid_LoginPage extends BaseTest
{
@Test
public void verify_ValidloginPage()
{
	LoginPage l1=new LoginPage(driver);
	l1.SetUserName("admin");
	l1.SetPassword("manager");
	l1.ClickonLoginButton();
}
}
