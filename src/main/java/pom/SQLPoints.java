
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class SQLPoints {

// public WebDriver driver=null;
// public SQLPoints (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public SQLPoints (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//a[contains(text(),'SQL - Databases')]")public WebElement Database;

@FindBy(xpath="//a[contains(text(),'SQL - Syntax')]")public WebElement Syntx;

@FindBy(xpath="//a[contains(text(),'SQL - Constraints')]")public WebElement Constrains;
//pomStart
	


}
