package sepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPageObject;

public class StepDefinitions extends Base {

	@Given("^User is on TekSchool page")
	public void user_is_on_TekSchool_page() throws Throwable {
		Base.initializeDriver();

	}

	@When("^User Click on Test Environment link$")
	public void user_Click_on_Cest_Environment_link() throws Throwable {
		System.out.println("test");

	}

	@Then("^User should see Test Environment page$")
	public void user_should_see_test_environment_page() throws Throwable {
		System.out.println("test");
	}

}
