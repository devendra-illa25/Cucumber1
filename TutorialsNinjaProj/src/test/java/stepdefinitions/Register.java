package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	
	
	
	@Given("^User navigate to register Account page$")
	public void User_navigate_to_register_Account_page() {
		System.out.println(">> User got navigated to register account page");
	}
	
//	@When("User enters firstname {string} into the first name field")
//	public void User_enters_firstname_into_the_first_name_field(String firstName) {
//		System.out.println(">>User entered first name:"+firstName);
//	}
//	
//	@And("User enters lastname {string} into the last name field")
//	public void User_enters_lastname_into_the_last_name_field(String lastName) {
//		System.out.println(">>User entered last name:"+lastName);
//	}
	
	@When("User enters below details into the fields")
	public void User_enters_below_details_into_the_fields(DataTable datatable) {
		
	
		Map<String, String> map = datatable.asMap(String.class,String.class);
		
	System.out.println("--User has entered the first name as"+map.get("firstname"));
	System.out.println("--User has entered the lastname as"+map.get("lastname"));
	System.out.println("--User has entered the email as"+map.get("email"));
	System.out.println("--User has entered the telephone as"+map.get("telephone"));
	System.out.println("--User has entered the password as"+map.get("password"));
	
	}
	
	//the commented part is not required bcz we are usng DataTbale
	
	
	
//	@And("Enters email address {string} into the Email Field")
//	public void Enters_email_address_into_the_Email_Field(String email) {
//		System.out.println(">>User Entered email address"+email);
//	}
//
//	@And("Enters telephone {int} into the telephone field") 
//	public void Enters_telephone_into_the_telephone_field(int telephoneNumber) {
//		System.out.println(">>User has entered telephone number"+telephoneNumber);
//	}
//	@And("enters password {int} into the password field")
//	public void enters_password_into_the_password_field(int passWord) {
//		System.out.println(">>User has entered password in field"+passWord);
//	}
//	
//	@And("enters password {int} into the password confirm field")
//	public void  enters_password_into_the_password_confirm_field(int confirmPassword) {
//		System.out.println(">>User has entered password inconfirm  field"+confirmPassword);
//	}
	@And("select privacy policy field")
	public void select_privacy_policy_field() {
		System.out.println(">>User selects privacy policy field");
	}
	@And("clicks on continue button")
	public void clicks_on_continue_button() {
		System.out.println(">>User clicks on continue button");
	}
	
	@Then("Account should get successfully created")
	public void Account_should_get_successfully_created() {
		System.out.println("User account is successfully created");
	}
	
	@And("selects yes for news letter")
	public void selects_yes_for_news_letter() {
		System.out.println(">>User selects yes for news letter");
		
	}
	@When("User dont enter details into any fields")
	public void User_dont_enter_details_into_any_fields() {
		System.out.println(">>User dont enterd details into fields");
	}
	@Then("Warning messages should be displayed for manditoty fields")
	public void Warning_messages_should_be_displayed_for_manditoty_fields() {
		System.out.println("Warning message is displayed for manditoty fields");
	}
@Then("Warning message informating the user about duplicate email should be displayed")
public void Warning_message_informating_the_user_about_duplicate_email_should_be_displayed() {
	System.out.println("Warning message informing duplicate email be displayed");
}

}


