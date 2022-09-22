package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.generics.Excel1;
import com.big_o_tires.pom.HomePage;
import com.big_o_tires.pom.LoginPage;

public class Verify_Valid_LoginPage_E extends BaseTest
{
@Test
public void verify_LoginPage()
{
	String sheet="Valid_LoginPage_E";
	String un = Excel1.getcell(PATH, sheet, 1, 4);
	
	String pw = Excel1.getcell(PATH, sheet, 1, 5);
	
	String lpt = Excel1.getcell(PATH, sheet, 1, 6);
	
	String hpt = Excel1.getcell(PATH, sheet, 1, 7);
	
	LoginPage v1 = new LoginPage(driver);
	v1.VerifyTitle(lpt);
	v1.SetUserName(un);
	v1.SetPassword(pw);
	v1.ClickonLoginButton();
	
	HomePage hh1=new HomePage(driver);
	hh1.VerifyTitle(hpt);
	hh1.ClickonLogoutButton();
}
	
	
}
