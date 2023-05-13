package TestCases;

import java.awt.desktop.SystemEventListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
//import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	
	 public static WebDriver driver ;
	 Properties config ;
	 @BeforeMethod
	 public void setup() throws Exception {
		 
	 config = new Properties() ;
	 File file = new File(System.getProperty("user.dir")+"/src/test/resources/config.properties" ) ;
	 FileInputStream fileinput = new FileInputStream(file);
	 config.load(fileinput);
	 
	 String browser = config.getProperty("browsertype");
	 
	 if(browser.equalsIgnoreCase( "chrome"))
	 {
	 driver= new ChromeDriver() ;
	  }
	 String url = config.getProperty("baseurl");
	 
	 driver.get(url);
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 }
	 @AfterMethod
		public void Logout(){
			
			driver.quit();
		}


}
