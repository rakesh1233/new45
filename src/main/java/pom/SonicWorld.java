
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class SonicWorld {

// public WebDriver driver=null;
// public SonicWorld (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public SonicWorld (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='txtUsername']")public WebElement txtUsername6;

@FindBy(xpath="//input[@id='txtPassword']")public WebElement txtPassword7;

@FindBy(xpath="//input[@id='btnLogin']")public WebElement Submit8;
//pomStart
	


}
