
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class SL044Unused {

// public WebDriver driver=null;
// public SL044Unused (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public SL044Unused (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@name='new_login_session_management']")public WebElement newloginsessionmanag;

@FindBy(xpath="//input[@name='languageChoice']")public WebElement languageChoice2;

@FindBy(xpath="//input[@id='clearPass']")public WebElement clearPass4;

@FindBy(xpath="//input[@id='authUser']")public WebElement authUser3;

@FindBy(xpath="//input[@placeholder='email']")public WebElement inputobj5;

@FindBy(xpath="//button[@id='login-button']")public WebElement buttonobj6;
//pomStart
	


}
