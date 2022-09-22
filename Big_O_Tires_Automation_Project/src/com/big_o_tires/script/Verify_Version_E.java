package com.big_o_tires.script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.big_o_tires.generics.Excel1;
import com.big_o_tires.pom.Versions;

import io.netty.util.Version;

public class Verify_Version_E  extends BaseTest
{

@Test
public void verify_VersionE()
{
	String sheet="VersionE";
	String ver = Excel1.getcell(PATH, sheet, 1, 3);
	Versions v1=new Versions(driver);
	v1.Verifyversion(ver);
	
	
	
}
}
