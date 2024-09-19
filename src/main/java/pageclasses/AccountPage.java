package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;
	
	@FindBy(linkText="Edit your account information")
	private WebElement editinformationoptiontext;
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public String displaystatusofaccountinformation() {
		String displayText=driver.findElement(By.linkText("Edit your account information")).getText();
	    return displayText;
	}

}
