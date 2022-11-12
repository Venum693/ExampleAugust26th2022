package com.sgtesting.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createuser();
		modify();
		deleteuser();
		logout();
		closeApplication();
	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Selenium\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsMenuCloseId\"]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("ABC");
			oBrowser.findElement(By.name("middleName")).sendKeys("M");
			oBrowser.findElement(By.name("lastName")).sendKeys("EF");
			oBrowser.findElement(By.name("email")).sendKeys("abc@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='EF, ABC M.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys("Venu");
			
			oBrowser.findElement(By.name("middleName")).clear();
			oBrowser.findElement(By.name("middleName")).sendKeys("M");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("lastName")).sendKeys("chari");
			
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("email")).sendKeys("venum@gmail.com");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='chari, Venu M.']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			 Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 private static void closeApplication()
	 {
		 try
		 {
			oBrowser.quit();
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
}
