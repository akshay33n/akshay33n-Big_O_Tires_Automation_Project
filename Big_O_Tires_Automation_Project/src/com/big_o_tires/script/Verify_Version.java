package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.pom.Versions;

public class Verify_Version extends BaseTest
{
@Test
public void VerifyVersion()
{
	Versions v1 = new Versions(driver);
	v1.Verifyversion("actiTIME 2016.3");
}
}
