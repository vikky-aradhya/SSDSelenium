package stepDefinitions;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePage extends BasePage {
	
	@Given("^test data is read from excel \"([^\"]*)\" under \"([^\"]*)\"$")
	public void test_data_is_read_from_excel_under(String scenarioName, String sheetName) throws Throwable {

		System.out.println(scenarioName);
		System.out.println(sheetName);
		readexceldata(scenarioName, sheetName);
		Thread.sleep(3000);
		Reporter.addStepLog("Test Data read successfully");
	}

	@When("^User opens browser$")
	public void user_opens_browser() throws Throwable {
		try {
			openBrowser();
			Reporter.addStepLog("Browser opened successfully");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			navigateToUrl();
			Reporter.addStepLog("Navigated to mercury tours successfully");
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
