package stepDefinitions;

import cucumber.api.java.en.And;
import pageOperations.LoginPageOperations;

public class LoginScenario extends BasePage {
	
	public LoginPageOperations logOps = new LoginPageOperations();
	
	@And("^user enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String name) throws Throwable {
		logOps.enterUserName(name);
		Thread.sleep(3000);
	}
	
	@And("^user enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String pwd) throws Throwable {
		logOps.enterPassword(pwd);
		Thread.sleep(3000);
	}

}
