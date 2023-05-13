package PageObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightBookingPage {
	
	WebDriver driver ;
	public double minFlightprice ;
	String text ;
	int row = 1;
	 WebElement choosetheFlightBtn;
	public flightBookingPage(WebDriver driver) {
		
		  this.driver =driver ;
		  PageFactory.initElements(this.driver,this);
		  
		    
		
	}
	
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[6]")
	List<WebElement> minimumPrice ;
	
	 
	 
	
	
	public void minimumFlightPrice()
	{
		List <Double> Flightprice = new ArrayList() ;
		for(WebElement ele : minimumPrice)
		{
			String price = ele.getText().substring(1) ;
			double minprice =  Double.parseDouble(price) ;  
			  
			 Flightprice.add(minprice);
		}
		 minFlightprice  =Collections.min(Flightprice);
		 text = "$"+ String.valueOf(minFlightprice);
		  for(WebElement ele :minimumPrice )
		  {
			 
			  if(ele.getText().equalsIgnoreCase(text))
				  break ;
			  row++;
		  }
		 
		  choosetheFlightBtn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr["+row+"]/td[6]//preceding::input[@type='submit'][1]"));
		  
		 clickchoosetheFlightBtn();
		 
		 
	}
	
	
	public  void  clickchoosetheFlightBtn() {
		
		choosetheFlightBtn.click();
	}

}
