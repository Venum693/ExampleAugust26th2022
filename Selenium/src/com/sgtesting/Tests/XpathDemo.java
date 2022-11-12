package com.sgtesting.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//absolutexpath();
		//relativeXpathUsingTagName();
		//relativeXpathusingTagnamewithIndex();
		//relativexpathusingtagnamewithAttributeNameValue();
		//relativeXpathUsingTagNameWithMultipleAttributeNameValue();
		//relativeXpathUsingTagnameWithMultipleAttributeNameUsingOrOperator();
		//relativeXpathUsingTagNameWithMultipleAttributeNameUsingAndOperator();
		//relativeXpathUsingAttributeNameValue();
		//relativeXpathUsingAttributeValueAlone();
	    //relativeXpathUsingTagNamewithAttributeName();
		//relativeXpathUsingTagNamewithAttributeName1();
		//relativeXpathUsingTagNamewithAttributeName2();
		//relativeXpathUsingTagNamewithAttributeName3();
		PartialMatchingOfAttributeValue();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Selenium\\Library\\drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file:\\\\E:\\SG Testing\\Selenium Assignment++++Notes\\Xpath\\Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absolutexpath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUSer1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativeXpathUsingTagName()
	{

		oBrowser.findElement(By.xpath("//input")).sendKeys("DEm");
	}
	private static void relativeXpathusingTagnamewithIndex()
	{
		oBrowser.findElement(By.xpath("//input[14]")).sendKeys("DEmois");
	}
	private static void relativexpathusingtagnamewithAttributeNameValue()
	{
			//oBrowser.findElement(By.xpath("//input[@name=pass1word1]")).sendKeys("NewPasswordDemo");
			oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("NewPasswordDemo");
			oBrowser.findElement(By.xpath("//input[@name='user1name1']")).sendKeys("venu");
	}
	private static void relativeXpathUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1'][@class='pass1word1']")).sendKeys("vdsdfsdfd");
	}
	private static void relativeXpathUsingTagnameWithMultipleAttributeNameUsingOrOperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1' or @classs='pass1word1']")).sendKeys("fafdsfasf");
	}
	private static void relativeXpathUsingTagNameWithMultipleAttributeNameUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1' and @class='pass1word1']")).sendKeys("sasasas");
	}
	private static void relativeXpathUsingAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//*[@id='btn1submit1button1']")).click();
	}
	private static void relativeXpathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='btn1submit1button1']")).click();
	}
	private static void relativeXpathUsingTagNamewithAttributeName()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));	
			int LinksCount=oLinks.size();
			
			System.out.println("Number of links"+LinksCount);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativeXpathUsingTagNamewithAttributeName1()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		int n=oLinks.size();
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String Linkname=link.getText();
			System.out.println(Linkname);
		}
	}
	private static void relativeXpathUsingTagNamewithAttributeName2()
	{
		try
		{
			List<WebElement> olink=oBrowser.findElements(By.xpath("//a[@href]"));
		
			for(int i=0;i<olink.size();i++)
			{
				WebElement Link=olink.get(i);
				String Linkname=Link.getText();
				
				if(Linkname.endsWith("Apache"))
						{
					         Link.click();
					         break;
						}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativeXpathUsingTagNamewithAttributeName3()
	{
		try
		{
			List<WebElement> oLink= oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLink.size();i++)
			{
				WebElement Link=oLink.get(i);
				String Linkname=Link.getText();
				if(Linkname.endsWith("Testing"))
				{
					Link.click();
					break;
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void PartialMatchingOfAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[startswith(@ id,'btn1')")).click();
	}
}
