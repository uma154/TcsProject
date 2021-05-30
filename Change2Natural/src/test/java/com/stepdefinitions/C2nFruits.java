package com.stepdefinitions;

import com.baseClasses.Library;
import com.pages.C2nfreshFruits;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C2nFruits extends Library {
	C2nfreshFruits C2n;
	
	@Given("To launching application on the browser")
	public void to_launching_application_on_the_browser() {
		browserSetUp();
		logger.info("Browswe has been launched");
	    
	}

	@When("Click on fresh fruits")
	public void click_on_fresh_fruits() throws InterruptedException {
		C2n=new C2nfreshFruits(driver);
		C2n.C2N_fruits();
	
	}
	   

	@Then("Click on Pomegranate")
	public void click_on_Pomegranate() throws InterruptedException {
		C2n=new C2nfreshFruits(driver);
		C2n.C2N_pomeGrante();
		
	}
	  

	@Then("Increase weight")
	public void increase_weight() {
		C2n=new C2nfreshFruits(driver);
		C2n.C2N_weight();
	   
	}

	@Then("Assert the price")
	public void assert_the_price() {
		C2n=new C2nfreshFruits(driver);
	   
	}

	@Then("Click on to cart")
	public void click_on_to_cart() {
		C2n=new C2nfreshFruits(driver);
		C2n.C2N_addtocart();
	   
	}

	@Then("Click on cart to check  the item")
	public void click_on_cart_to_check_the_item() {
	    
		C2n=new C2nfreshFruits(driver);
		C2n.C2N_cart();
	}

	@Then("Click on checkout")
	public void click_on_checkout() {
		C2n=new C2nfreshFruits(driver);
		C2n.C2N_checkout();
	    
	}

	@Then("Enter email and password credentials")
	public void enter_email_and_password_credentials() {
		C2n=new C2nfreshFruits(driver);
		
		C2n.C2N_username(properties.getProperty("email"));
		C2n.C2N_password(properties.getProperty("pwd"));
	   
	}

	@Then("Click on login")
	public void click_on_login() {
		C2n=new C2nfreshFruits(driver);
		C2n.C2N_login();
	    
	}	
	}


