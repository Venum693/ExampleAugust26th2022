package com.sgtesting.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
public static WebDriver oBrowser=null;
public static ActiTimePage oPage=null;


	public static void main(String[] args) {
		launchBrowser();
		navigt();
		login();
		minimizeflyout();
	}

	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Selenium\\Library\\drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();
			oPage= new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void navigt()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			
			oPage.getlogin().click();
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeflyout()
	{
		try
		{
			oPage.gettingstartedshortcutpanelId().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
