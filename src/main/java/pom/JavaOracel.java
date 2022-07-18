
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class JavaOracel {

// public WebDriver driver=null;
// public JavaOracel (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public JavaOracel (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='menu']")public WebElement menu1;

@FindBy(partialLinkText="Priva")public WebElement Privacy;

@FindBy(xpath="//a[contains(text(),'Support')]")public WebElement Support;

@FindBy(xpath="//a[contains(text(),'Terms of Use')]")public WebElement TermsOfUse;

@FindBy(xpath="//a[contains(text(),'OpenJDK Early Access Builds')]")public WebElement aobj17;
//pomStart
	


}
