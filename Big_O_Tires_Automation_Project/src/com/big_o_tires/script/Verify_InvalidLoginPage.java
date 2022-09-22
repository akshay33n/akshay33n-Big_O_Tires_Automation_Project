package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.pom.InvalidLoginPage;
import com.big_o_tires.pom.LoginPage;

public class Verify_InvalidLoginPage extends BaseTest
{
@Test
public void verifyInvalidLoginPage() throws InterruptedException
{
	

LoginPage l1=new LoginPage(driver);
l1.SetUserName("akshay");
l1.SetPassword("123456");
l1.ClickonLoginButton();
Thread.sleep(5000);
InvalidLoginPage i1 = new InvalidLoginPage(driver);
i1.VerifyErrorMsg();
}
}