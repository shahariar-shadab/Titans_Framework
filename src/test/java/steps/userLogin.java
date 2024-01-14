package steps;

import org.testng.Assert;

import common.amazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.amazonHomePage;

public class userLogin extends amazonBase {
	
	amazonHomePage ap;
	
	@Given("i am on the amazon home page")
	public void i_am_on_the_amazon_home_page() {
		
		launchbrowser();
	    
	}

	@When("i click on the sign in button in the homepage")
	public void i_click_on_the_sign_in_button_in_the_homepage() {
		
		ap = new amazonHomePage(driver);
		ap.clickOnSignButtonInHomePage();
	  
	}

	@When("i enter the {string} in the email input bar")
	public void i_enter_the_in_the_email_input_bar(String string) {
		
		ap = new amazonHomePage (driver);
		ap.enterEmailAddress(string);
	   
	}

	@When("i click on the continue button")
	public void i_click_on_the_continue_button() {
		
		ap = new amazonHomePage (driver);
		ap.clickOnContinueButton();
	   
	}

	@When("i enter the {string} in the password input bar")
	public void i_enter_the_in_the_password_input_bar(String string) {
		
		ap = new amazonHomePage(driver);
		ap.enterUserPassword(string);

	}

	@When("i click on the sign in button")
	public void i_click_on_the_sign_in_button() {
		
		ap = new amazonHomePage (driver);
		ap.clickOnSignButtonInSigninPage();
	   
	}

	@Then("i can login into my account successsfully")
	public void i_can_login_into_my_account_successsfully() {
		
		ap = new amazonHomePage(driver);
		Assert.assertTrue(ap.verifySearchResults());
		
		//now we quite all the windows 
		
		closeall();
	  
	}


}
