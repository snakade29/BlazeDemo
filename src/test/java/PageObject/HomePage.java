package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	 WebDriver driver ;
	  List<WebElement> options ;
	  List<WebElement> option ;
	  Select selectdpart ;
	  Select selectDestination ;
	  public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver =driver ;
		  PageFactory.initElements(this.driver,this);
		  
		  
		     selectdpart= new Select(selectdpartbtn);
		    options  = selectdpart.getOptions();
		    
		     selectDestination=new Select(selectdestbtn);
		    option  =   selectDestination.getOptions();
		   
		  
		  
		  
	}  
	  
	   @FindBy(xpath="//a[text()='destination of the week! The Beach!']")
		WebElement  Btn ;
	   
	   @FindBy(xpath="//select[@name='fromPort']")
	    WebElement  selectdpartbtn ;
	   
	   
	   @FindBy(xpath="//select[@name='toPort']")
	   WebElement   selectdestbtn  ;
	   
	   
	   @FindBy(xpath=" //input[@type='submit']")
	   WebElement findFlightbtn ;
	    
	   
	   
	   
	  
	 
	  public void Clickonlink()
	  {
		 Btn.click();  
	  }
	  
	  
	  
	  public void chooseDepartureCity(String city) {
		   
		  for(WebElement ele : options)
		   {
			   
			   if (ele.getText().equalsIgnoreCase(city))
			   {
				   selectdpart.selectByVisibleText(city);
			   }
		   }
		    
			   
			    
			   
		   
		   
	   }
	   
	   public void chooseDestinationCity(String city) {
		   
		   for(WebElement ele : option)
		   {
			   
			   if (ele.getText().equalsIgnoreCase(city))
			   {
				   selectDestination.selectByVisibleText(city);
			   }
		   }
		   
		   
		   
	   }
	   
	   
	   public void clickFindFlightbtn()
	   {
		   findFlightbtn.click();
	   }
	  
	
	
	
	

}
