
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class OrengeAfLogin {

// public WebDriver driver=null;
// public OrengeAfLogin (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public OrengeAfLogin (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//b[contains(text(),'Leave')]")public WebElement Leave;

@FindBy(xpath="//a[@id='menu_leave_viewMyLeaveList']")public WebElement MyLeave;

@FindBy(xpath="//b[contains(text(),'Performance')]")public WebElement Performance;

@FindBy(xpath="//a[@id='menu_performance_viewEmployeePerformanceTrackerList']")public WebElement EmpTracker;
//pomStart
	


}
