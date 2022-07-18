
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class PracticeAuto {

// public WebDriver driver=null;
// public PracticeAuto (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public PracticeAuto (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//div[@id='slider_row']//li[2]//div[1]")public WebElement Except;

@FindBy(xpath="//div[@id='htmlcontent_top']//li[@class='htmlcontent-item-1 col-xs-4']//img[@class='item-img']")public WebElement ItemImg;

@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-line last-item-of-tablet-line last-item-of-mobile-line hovered']//img[@class='replace-2x img-responsive']")public WebElement replaceImg;

@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-line last-item-of-tablet-line last-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]")public WebElement AddToCart;
//pomStart
	


}
