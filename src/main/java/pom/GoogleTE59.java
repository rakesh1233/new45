
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class GoogleTE59 {

// public WebDriver driver=null;
// public GoogleTE59 (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public GoogleTE59 (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@name='q']")public WebElement q1;

@FindBy(xpath="//div[@class='CqAVzb lJ9FBc']//input[@name='btnK']")public WebElement btnK2;

@FindBy(xpath="//div[@class='CqAVzb lJ9FBc']//input[@name='btnI']")public WebElement btnI3;

@FindBy(xpath="//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")public WebElement btnK4;

@FindBy(linkText="fcccccc")public WebElement voicebutton;
//pomStart
	


}
