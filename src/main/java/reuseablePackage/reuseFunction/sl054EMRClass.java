
package reuseablePackage.reuseFunction;
import pom.SL054EMR;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class sl054EMRClass{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public sl054EMRClass(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();
public void sl054EMR() throws Exception
{
actions.EnterApplicationURL("http://34.232.235.205/openemr/openemr/interface/login/login.php?site=default");
actions.ThreadSleep("3000");
actions.EnterData(new SL054EMR(driver).authUser3,"authUser3");
actions.EnterData(new SL054EMR(driver).clearPass4,"clearPass4");
actions.Click(new SL054EMR(driver).buttonobj6);







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

// public class sl054EMRClass extends  AllActions {
// 	public static WebDriver driver;
	
// 	AllActions actionObject = new AllActions();
	
// 	}  
// }