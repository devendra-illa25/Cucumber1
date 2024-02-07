package stepdefinitions;

//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	
	//@Before("@register")
//	public void setup() {
//		
//		System.out.println("Browser got opened");
//	}
//	@After("@register")
//	public void tearDown() {
//		System.out.println("Browser got closed");
//	}
	
	
	public void beforeEverySteo() {
		System.out.println("Before every step hook");
	}
	
	
	public void afterEveryStep() {
		System.out.println("After every step hook");
	}
	
	
	@Given("User opens the application")
	public void user_opens_the_application() {
	    System.out.println(">>Application got opened ");
	}

	@When("User enters valid product into search field")
	public void user_enters_valid_product_into_search_field() {
	    System.out.println(">>Valid product got entered into search field");
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	    System.out.println(">>User clicked on search button");
	}

	@Then("Valid product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
		System.out.println(">>valid product got displayed in search result");
	}

	@When("User enters non-existing product into search field")
	public void user_enters_non_existing_product_into_search_field() {
		System.out.println(">>Non-Existing product got entered into search field");
	}

	@Then("proper text informing the user about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
		System.out.println(">>No product matching message got displayed");
	}

	@When("User dont enters any product into search field")
	public void user_dont_enters_any_product_into_search_field() {
		System.out.println(">>No product is entered into search field");
		
	}



}
