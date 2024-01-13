package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonHomePage {
	
	WebDriver driver;
	
	public amazonHomePage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (xpath="//a[@id=\"nav-link-accountList\"]")
	WebElement signInButton;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement userpassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signInButton2;
	
	@FindBy(xpath ="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement searchResults;
	
	
	public void clickOnSignButtonInHomePage() {
		
		signInButton.click();
	}
	
	public void enterEmailAddress(String email) {
		
		emailAddress.sendKeys(email);
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
		
	}
	
    public void enterUserPassword(String password) {
		
		userpassword.sendKeys(password);
	}
    
    public void clickOnSignButtonInSigninPage() {
		
		signInButton2.click();
	}
    
    public boolean verifySearchResults() {
		
		return searchResults.isDisplayed();
	}
    
    
    @FindBy(id="twotabsearchtextbox")
    WebElement searchBar;
    
    @FindBy (id="nav-search-submit-button")
    WebElement searchbutton;
    
    public void searching  (String products) {
    	searchBar.sendKeys(products);
    }
    
    public void click_button() {
    	searchbutton.submit();
    }
    


}
