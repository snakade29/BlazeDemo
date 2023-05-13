package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfoPage {
	
	
	 WebDriver driver ;
	public  CustomerInfoPage (WebDriver driver) {
		
		  this.driver =driver ;
		  PageFactory.initElements(this.driver,this);
		  
		}
	
	
	@FindBy (xpath="//p[text()='Total Cost: ']")
	WebElement totalCostEle ;
	
	@FindBy (xpath="//em[text()='914.76 ']")
	WebElement formatcheckele ;
	
	@FindBy (xpath="//input[@type='submit']")
	WebElement  purchaseFlightbtn ;
	
	
	
	
	
	
	public boolean totalCostisDisplayed()
	{
		 if(totalCostEle.isDisplayed())
		return true ;
		 else 
			 return false ;
	}
	public float formatcheck() {
		
		String text =formatcheckele.getText();
		float d = Float.parseFloat(text);
		return d;
		
	}
	
	public void purchaseFlightclick()
	{
		purchaseFlightbtn.click();
	}
	
	
	
	
	

}
