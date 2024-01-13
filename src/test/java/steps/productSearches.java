package steps;

import common.amazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.amazonHomePage;

public class productSearches extends amazonBase {
	
	amazonHomePage ap;
	
	@Given("i am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
	   
		launchbrowser();
	}

	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {
	    
		ap = new amazonHomePage(driver);
		ap.searching(string);
	}

	@When("i click on the search icon")
	public void i_click_on_the_search_icon() {
		
		ap = new amazonHomePage (driver);
		ap.click_button();
	   
	}

	@Then("i can see the search results successfully")
	public void i_can_see_the_search_results_successfully() {
		
		System.out.println("==============================================");
		
		String titel = driver.getTitle();
		System.out.println(titel);
		
		System.out.println("===============================================");
		
		closeall();
		
	  
	}


}
