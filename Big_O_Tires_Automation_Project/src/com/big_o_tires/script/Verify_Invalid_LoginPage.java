package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.generics.Excel1;
import com.big_o_tires.pom.InvalidLoginPage;
import com.big_o_tires.pom.LoginPage;

public class Verify_Invalid_LoginPage extends BaseTest
{

@Test
public void verify_Invalid_loginPage()
{
	String sheet="Verfy_Invalid_LoginPage_E";
	
	int totalrows = Excel1.getRowCount(PATH, sheet);
	
	for(int i=0;i<totalrows;i++)
	{
		String un = Excel1.getcell(PATH, sheet, i, 1);
		String pw = Excel1.getcell(PATH, sheet, i, 2);
		
		LoginPage l1 = new LoginPage(driver);
		
		l1.SetUserName(un);
		l1.SetPassword(pw);
		
		InvalidLoginPage i1 = new InvalidLoginPage(driver);
		
		i1.VerifyErrorMsg();
		
	}
}
}
