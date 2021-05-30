package com.stepDefinitions;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.testng.Assert;

import com.baseclass.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class EmployeeDetailsApis extends Base {

	Response response;
	JsonPath js;

	@Given("the user is given with the base uri")
	public void the_user_is_given_with_the_get_employee_method_base_uri() throws IOException {
		BaseSetup();
		baseURI = uri;

	}

	@When("the user calls the get employee details api")
	public void the_user_calls_the_get_employee_details_api() {

		response = given().log().all().header("Content-Type", "application/json").when().get("api/v1/employees").then()
				.log().all().extract().response();

	}

	@Then("all the employee details are displayed successfully")
	public void all_the_employee_details_are_displayed_successfully() {

		String res = response.asString();
		js = new JsonPath(res);
		String actual = js.get("status");
		Assert.assertEquals(actual, "success");

	}

	@When("the user calls the get employee details api with the {string}")
	public void the_user_calls_the_get_employee_details_api_with_the(String id) {

		response = given().log().all().pathParam("id", id).header("Content-Type", "application/json").when()
				.get("api/v1/employee/{id}").then().log().all().extract().response();

	}

	@Then("the employee details should be displayed successfully")
	public void the_employee_details_should_be_displayed_successfully() {
		String res = response.asString();
		js = new JsonPath(res);
		String actual = js.get("status");
		Assert.assertEquals(actual, "success");

	}

	@Then("verify the success code {int}")
	public void verify_the_success_code(Integer int1) {

		Integer actualCode = response.getStatusCode();
		Assert.assertEquals(actualCode, int1);

	}

/*	@When("the user calls the delete employee details api with the {string}")
	public void the_user_calls_the_delete_employee_details_api_with_the(String id) {
		response = given().log().all().pathParam("id", id).header("Content-Type", "application/json").when()
				.delete("api/v1/delete/{id}").then().log().all().extract().response();
	}

	@Then("the employee details should be deleted successfully")
	public void the_employee_details_should_be_deleted_successfully() {
		String res = response.asString();
		js = new JsonPath(res);
		String actual = js.get("message");
		Assert.assertEquals(actual, "successfully! deleted Records");
	}*/

}
