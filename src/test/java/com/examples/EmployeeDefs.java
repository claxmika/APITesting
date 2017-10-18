package com.examples;

import static org.hamcrest.MatcherAssert.assertThat;

import org.springframework.http.HttpStatus;

import cucumber.api.java.en.*;


public class EmployeeDefs extends SpringIntegrationTest {

	@When("^the client calls /customer$")
	public void the_employee_issues_GET_version() throws Throwable {
		executeGet("http://localhost:8090/customer");
	}
	
	@Then("^the employee receives status code of (\\d+)$")
	public void thestatus_code_of_employee_code(int statusCode) throws Throwable {
		final int currentStatusCode = LatestResponse.getStatusLine().getStatusCode();
		System.out.println(currentStatusCode);
		System.out.println(statusCode);
		//assertThat("status code is incorrect : "+ currentStatusCode, is(statusCode));
	}
	
	@And("^the response should contain:$")
	public void the_employee_receives_server_version_body(String version) throws Throwable {
		System.out.println(version);
		System.out.println(body);
		//assertThat(LatestResponse.getBody(), is(version));
	}

}
