package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.pom.LoginPage;
import com.big_o_tires.pom.Reports;

public class Verify_Reports extends BaseTest
{
@Test
public void VerifyReports()
{
	LoginPage l1=new LoginPage(driver);
	l1.SetUserName("admin");
	l1.SetPassword("manager");
	l1.ClickonLoginButton();

Reports r1 =new Reports(driver);
r1.clickonTasks();
r1.clickoncreatereports();
r1.clickoncpb();
r1.clickonapplyreportconfigurration();
}
}
