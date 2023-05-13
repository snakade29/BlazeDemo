package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchaseConfirmationPage {
	
	WebDriver driver ;
	public  purchaseConfirmationPage (WebDriver driver) {
		
		  this.driver =driver ;
		  PageFactory.initElements(this.driver,this);
		  
		}
	
	@FindBy (xpath=" /html/body/div[2]/div/table/tbody/tr[1]/td[2]")
	WebElement id ; 
	
	
	public void printId()
	{
		System.out.println(id.getText());
	}
	

}
