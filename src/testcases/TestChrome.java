package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestChrome {

    static WebDriver driver;
	static String nodeUrl;

	public static void main(String[] args) {
              try {
                     // TODO Auto-generated method stub                 

                     nodeUrl = "http://169.254.166.213:5555/wd/hub";
            	  	 //System.setProperty("webdriver.chrome.driver", "E:\\Studies\\eclipse-workdir\\TestNGDemo\\lib\\driver\\chromedriver.exe");

                     DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                     capabilities.setBrowserName("chrome");
                     capabilities.setPlatform(Platform.WINDOWS);
                     capabilities.setVersion("64.0.3282.140");

                     driver = new RemoteWebDriver(new URL(nodeUrl),capabilities);
					 //WebDriver driver = new ChromeDriver();
					 
                     driver.manage().deleteAllCookies();
                     driver.manage().window().maximize();
                     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                     driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
                     driver.get("https://www.amazon.in");
                     driver.findElement(By.linkText("Today's Deals")).click();

              } catch (MalformedURLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
       }
}