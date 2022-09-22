package com.big_o_tires.script;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Automation_Regression_Input
{
public WebDriver driver;

Logger logger;
@BeforeMethod
public void preCondition()
{
	logger=Logger.getLogger("devpinoyLogger");
	logger.info("open the browser");
	//open the browser
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	//enter URL
	driver.get("http://localhost/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
}
@AfterMethod
public void postcondition() throws InterruptedException
{
	Thread.sleep(5000);
driver.close();
}
}
