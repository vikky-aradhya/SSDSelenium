package pageOperations;

import pages.RegisterPage;
import stepDefinitions.BasePage;

public class RegisterPageOperations extends RegisterPage {
	
	public BasePage basePage = new BasePage();
	
	public void clickRegisterButton() {
		try {
			getRegisterbtn().click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void enterContactInformation(String firstName, String lastName, String phone, String email) {
		try {
			getFirstnametxt().sendKeys(firstName);
			getLastnametxt().sendKeys(lastName);
			getPhonetxt().sendKeys(phone);
			getEmailtxt().sendKeys(email);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void enterMailingInformation(String address, String city, String state, String postalCode, String country) {
		try {
			getAddresstxt().sendKeys(address);
			getCitytxt().sendKeys(city);
			getStatetxt().sendKeys(state);
			getPostalcodetxt().sendKeys(postalCode);
			basePage.selectByText(getCountrytxt(), country);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void enterUserInformation(String userName, String password, String confirmPassword) {
		try {
			getUsernametxt().sendKeys(userName);
			getPasswordtxt().sendKeys(password);
			getConfpasswordtxt().sendKeys(confirmPassword);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void clickSubmitButton() {
		try {
			getSubmitbtn().click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
