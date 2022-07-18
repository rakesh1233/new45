
package reuseablePackage.reuseFunction;
import pom.OrengeLogin;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class orengeLoginClass{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public orengeLoginClass(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();
public void orengeLogin() throws Exception
{
actions.EnterApplicationURL("https://opensource-demo.orangehrmlive.com/");
actions.EnterData(new OrengeLogin(driver).txtUsername6,"Admin");
actions.EnterData(new OrengeLogin(driver).txtPassword7,"admin123");
actions.Click(new OrengeLogin(driver).Submit8);
actions.ThreadSleep("3000");







}
}



































// package reuseablePackage.feature;

// import java.util.concurrent.TimeUnit;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import java.net.MalformedURLException;

// public class orengeLoginClass extends  AllActions {
// 	public static WebDriver driver;
	
// 	AllActions actionObject = new AllActions();
	
// 	}  
// }