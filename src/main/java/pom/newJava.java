
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class newJava {

// public WebDriver driver=null;
// public newJava (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public newJava (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//a[contains(text(),'Terms of Use')]")public WebElement aobj24;

@FindBy(xpath="//a[contains(text(),'Trademarks')]")public WebElement aobj25;

@FindBy(xpath="//a[contains(text(),'Privacy')]")public WebElement aobj22;

@FindBy(xpath="//a[contains(text(),'Support')]")public WebElement aobj21;
//pomStart
	


}
