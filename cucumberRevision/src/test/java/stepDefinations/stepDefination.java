package stepDefinations;

import org.junit.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {

	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("Netbanking landing page home page");

	}

	@When("^user login into application with proper \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_proper_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1 + " logged in with credential: " + arg2);
	}

	@Then("^home page is populated$")
	public void home_page_is_populated() throws Throwable {

		System.out.println("Home page is populated");

	}

	@Then("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {

		System.out.println("Cards are displayed");

	}

}
