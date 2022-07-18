
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class CompareObj {

// public WebDriver driver=null;
// public CompareObj (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public CompareObj (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='fname']")public WebElement fname1;

@FindBy(xpath="//input[@id='vehicle1']")public WebElement vehicle12;



@FindBy(xpath="//button[@class='dropbtn']")public WebElement buttonobj4;

@FindBy(xpath="//a[contains(text(),'Link 1')]")public WebElement aobj5;

@FindBy(xpath="//input[@id='txtUsername']")public WebElement txtUsername6;

@FindBy(xpath="//input[@id='txtPassword']")public WebElement txtPassword7;


//pomStart
	


}
