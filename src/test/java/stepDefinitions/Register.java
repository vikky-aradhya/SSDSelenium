package stepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageOperations.RegisterPageOperations;

public class Register extends BasePage {

	public RegisterPageOperations regOps = new RegisterPageOperations();

	@And("^verify the Register Page title$")
	public void verify_the_register_page_title() throws Throwable {
		String expected = "Register: Mercury Tours";
		Assert.assertEquals(driver.getTitle(), expected);
	}

	@Then("^user clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
		regOps.clickRegisterButton();
	}

	@And("^user enters Contact Information$")
	public void user_enters_Contact_Information() throws Throwable {
		regOps.enterContactInformation(testdataMap.get("FirstName"), testdataMap.get("LastName"),
				testdataMap.get("Phone"), testdataMap.get("Email"));
	}

	@And("^user enters Mailing Information$")
	public void user_enters_Mailing_Information() throws Throwable {
		regOps.enterMailingInformation(testdataMap.get("Address"), testdataMap.get("City"), testdataMap.get("State"),
				testdataMap.get("Postal_Code"), testdataMap.get("Country"));
	}

	@And("^user enters User Information$")
	public void user_enters_User_Information() throws Throwable {
		regOps.enterUserInformation(testdataMap.get("Username"), testdataMap.get("Password"),
				testdataMap.get("Password"));
	}

	@Then("^user clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
		regOps.clickSubmitButton();
	}

}
