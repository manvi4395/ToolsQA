package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	public WebDriver driver;
	
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on Tools QA form page")
	public void user_is_on_tools_qa_form_page() {
		
		
		System.out.println("User is on the Registration form page");
	   
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		
		loginPage.getTitleOfPage();
	    
	}

	@When("user enters the firstname")
	public void user_enters_the_firstname() {
		
		loginPage.entersUserName();
	    
	}

	@When("user enters the lastname")
	public void user_enters_the_lastname() {
		
		loginPage.entersLastName();
	    
	}

	@When("user enters the emailId")
	public void user_enters_the_email_id() {
		
		loginPage.entersEmailId();
	 
	}

	@When("user selects the Gender")
	public void user_selects_the_gender() {
		
		loginPage.selectGender();
	    
	}

	@When("user enters the mobile number")
	public void user_enters_the_mobile_number() {
		
		loginPage.enterMobileNumber();
	  
	}

	@When("user enters the date of birth")
	public void user_enters_the_date_of_birth() {
		
		loginPage.entersDob();
	   
	}

	@When("user enters the subjects")
	public void user_enters_the_subjects() {
		
		loginPage.enterSubjects();
	   
	}

	@When("user selects hobbies")
	public void user_selects_hobbies() {
		
		loginPage.selectsHobbiies();
	   
	}

	@When("user enters the Current Address")
	public void user_enters_the_current_address() {
		
		loginPage.enterAddress();
	   
	}

	@When("user selects the state and city")
	public void user_selects_the_state_and_city() {
	    
	}

	@When("user selects city")
	public void user_selects_city() {
	    
	}

	@Then("user clicks on the Submit button")
	public void user_clicks_on_the_submit_button() {
	   
	}


}
