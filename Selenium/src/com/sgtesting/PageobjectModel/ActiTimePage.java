package com.sgtesting.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	
	private WebElement username;
	
	public WebElement getusername()
	{
		return username;
	}
	
	private WebElement pwd;
	
	public WebElement getpassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	
	public WebElement getlogin()
	{
		return oLogin;
	}

	private WebElement gettingstartedshortcutpanelId;
	public WebElement gettingstartedshortcutpanelId()
	{
		return gettingstartedshortcutpanelId;
	}
	
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}