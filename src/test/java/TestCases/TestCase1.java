package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.CustomerInfoPage;
import PageObject.flightBookingPage;
import PageObject.purchaseConfirmationPage;
import pages.HomePage;

public class TestCase1 extends BaseClass{
	
	
	
	@Test
	public void checktheTitle()
	{
	String actualTitle = driver.getTitle();
	 
	String expectedTitle = "Welcome to the Simple Travel Agency!`" ;
	 
	
	Assert.assertEquals(actualTitle,expectedTitle );
		
	}
	
	@Test 
	public  void clickopertaion() throws InterruptedException
	{
		PageObject.HomePage homepage = new PageObject.HomePage(driver);
		
		homepage.Clickonlink() ;
		
		String currenturl = driver.getCurrentUrl();
		 
		Assert.assertTrue(currenturl.contains("vacation"));
		
		driver.get("https://blazedemo.com/index.php");
		Thread.sleep(5000);
		
		 
		
	}
	
	
	
	@Test 
	public void purchaseticket() throws InterruptedException {
		
		PageObject.HomePage homepage = new PageObject.HomePage(driver);
		Thread.sleep(2000);
		homepage.chooseDepartureCity("Boston");
		Thread.sleep(2000);
		homepage.chooseDestinationCity("London");
		Thread.sleep(2000);
		
		homepage.clickFindFlightbtn();
		Thread.sleep(2000);
		
		flightBookingPage flightbook = new flightBookingPage(driver) ;
		
		flightbook.minimumFlightPrice();
		
		Thread.sleep(5000);
		
		CustomerInfoPage customerInfoPage = new CustomerInfoPage(driver) ; 
		
		Assert.assertTrue(customerInfoPage.totalCostisDisplayed());
		
		
		Assert.assertEquals(customerInfoPage.formatcheck(),914.760009765625);
		
		
		customerInfoPage.purchaseFlightclick();
		
		Thread.sleep(5000);
		
		
		String url = driver.getCurrentUrl();
		
		Assert.assertTrue(url.contains("confirmation"));
		
		
		purchaseConfirmationPage confPage = new purchaseConfirmationPage (driver) ;
		
		confPage.printId();
		
	}
	
	 
	  
	
	
	
	

}
