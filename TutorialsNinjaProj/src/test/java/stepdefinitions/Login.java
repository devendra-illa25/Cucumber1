package stepdefinitions;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//we can write now manually

public class Login {
	
	
	public void setup() {
		System.out.println("++before hook - setup method got executed++");
	}
	
	public void tearDown() {
		System.out.println("--after hook-teardown method got executed--");
	}
	
	
	@Given("^User navigates to Login page$")
	public void User_navigates_to_Login_page() {
		
		System.out.println(">>User got navigated to Login page");
	}
	
	@When("^User enters valid email address (.+)$")
	public void User_enters_valid_email_address(String email) {
	System.out.println(">> User has entered valid email address :"+email);
	}
	
	@And("^Enters Valid password(.+)$")
	public void Enters_Valid_password(String password) {
		System.out.println(">>ser entered valid password:"+password);
	}
	@And("^Clicks on login button$")
	public void Clicks_on_login_button() {
		System.out.println(">> USer has clicked on login button");
		
	}
	@Then("^User should login successfully$")
	public void User_should_login_successfully() {
		System.out.println(">> User logined successfully");
	}
	@When("^User enters invalid email address (.+)$")
	public void User_enters_invalid_email_address(String invalidEmail) {
		System.out.println(">> User has entered invalid email address:"+invalidEmail);
		
	}
	@And("^Enters inValid password (.+)$")
	public void  Enters_inValid_password(String inValidPassword) {
		System.out.println(">>User entered invalid password:"+inValidPassword);
	}
	@Then("^User should get a proper warning message$")
	public void User_should_get_a_proper_warning_message () {
		System.out.println(">>User get warning message");
	}
	
	@When("User dont enter any credentails$")
	public void User_dont_enter_any_credentails() {
	System.out.println("user has not entered anycredentais");
	}
	
	}
