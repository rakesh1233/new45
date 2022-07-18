
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class SL054EMR {

// public WebDriver driver=null;
// public SL054EMR (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public SL054EMR (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//button[@id='login-button']")public WebElement buttonobj6;

@FindBy(xpath="//input[@id='authUser']")public WebElement authUser3;

@FindBy(xpath="//input[@id='clearPass']")public WebElement clearPass4;
//pomStart
	


}
