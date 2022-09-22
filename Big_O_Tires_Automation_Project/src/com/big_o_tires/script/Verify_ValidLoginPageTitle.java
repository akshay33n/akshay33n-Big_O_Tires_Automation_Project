package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.pom.LoginPage;

public class Verify_ValidLoginPageTitle extends BaseTest
{
@Test
public void verifyvalidloginpagetitle()
{
	LoginPage l1 =new LoginPage(driver);
			l1.VerifyTitle("actiTIME - Login");
}
}
