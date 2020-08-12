package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	@Given("^I lunch the application$")
	public void i_lunch_the_application() {
	    
	}

	@And("^I navigate to registration page$")
	public void i_navigate_to_registration_page(){
	   Base.driver.get(Base.reader.getUrl()); 
	}

	@When("^I provide the below details$")
	public void i_provide_the_below_details(DataTable dataTable){
	   
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
	    
	}

	@And("^I click on the continue button$")
	public void i_click_on_the_continue_button(){


	}

	@Then("^the account should be created succeffully created$")
	public void the_account_should_be_created_succeffully_created(){
	   
	}

}
