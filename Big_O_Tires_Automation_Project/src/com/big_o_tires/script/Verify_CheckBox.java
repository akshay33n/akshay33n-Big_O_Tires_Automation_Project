package com.big_o_tires.script;

import org.testng.annotations.Test;

import com.big_o_tires.pom.CheckBox;
import com.big_o_tires.pom.LoginPage;

public class Verify_CheckBox extends BaseTest
{
@Test
public void VerifyCheckbox()

{
CheckBox c1 =new CheckBox(driver);
c1.ClickOnCheckBox();

	}
}
