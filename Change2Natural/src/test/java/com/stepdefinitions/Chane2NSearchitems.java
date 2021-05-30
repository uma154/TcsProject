package com.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;

import com.baseClasses.Library;
import com.pages.C2NSearchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Chane2NSearchitems extends Library {

	C2NSearchpage C2n;
	@Given("To launch Application on the browser")
	public void To_launch_Application_on_the_browser() {
		browserSetUp();
	}
	
		@When("enter bananas")
	public void enter_bananas() {
	    C2n=new C2NSearchpage(driver);
	    
	    C2n.searchApp_keyword(properties.getProperty("search"));
	}

	@Then("Click search")
	public void Click_search() {
		
	    C2n.searchApp_searchbutton();
	}
	@When("the items are open")
	public void the_items_are_open() throws InterruptedException {
		//C2n=new C2NSearchpage(driver);
		C2n.searchApp_item();
	}

	@Then("Click on bananas")
	public void click_on_bananas() throws InterruptedException {
	    C2n.searchApp_item();
	  
	}

	@Then("add to cart")
	public void add_to_cart() throws InterruptedException {
		    C2n.searchApp_addtocart();
	    
	}

	@Then("print item added to cart successfully.")
	public void print_item_added_to_cart_successfully() {
	    System.out.println("Items added to cart sucessfully.");

}
}
