package com.stepdefinitions;

import com.baseClasses.Library;
import com.pages.Change2NLoginpages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Change2NLoginsteps extends Library{
	Change2NLoginpages c2n;
	@Given("To launch the Application on the browser")
	public void to_launch_the_Application_on_the_browser() {
	    browserSetUp();
	}

	@When("Click on Login\\/Register link")
	public void click_on_Login_Register_link() {
	     c2n=new Change2NLoginpages(driver);
	     c2n.loginToApp_loginlink();
	}

	@Then("Enter email and password")
	public void enter_email_and_password() {
	    c2n.loginToApp_username(properties.getProperty("email"));
	    c2n.loginToApp_password(properties.getProperty("pass"));
	}
	@Then("Click on Login Button")
	public void click_on_Login_Button() {
	   c2n.loginToApp_loginbutton();
	}

}
