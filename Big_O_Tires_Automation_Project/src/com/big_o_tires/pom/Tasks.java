package com.big_o_tires.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks extends BasePage
{
@FindBy(xpath="//div[text()='TASKS']")
private WebElement task;
	
@FindBy(name="visiableFilterString")
private WebElement filterTaskName;

@FindBy(name="searchTasks")
private WebElement searchTaskName;
			
	public Tasks(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void clickOnTasksButton()
	{
		task.click();
	}
	public void sendFilterTaskName(String ftn)
	{
		filterTaskName.sendKeys(ftn);
	}
	public void clickOnApplyFilterButton()
	{
		searchTaskName.click();
	}
}
