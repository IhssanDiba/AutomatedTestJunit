package StepDefinition;

import io.cucumber.java.en.*;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : clicks on login button");
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user navigated to the home page");
	}
}
