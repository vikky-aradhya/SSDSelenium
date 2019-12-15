package pageOperations;

import pages.LoginPage;
import stepDefinitions.BasePage;

public class LoginPageOperations extends LoginPage {
	
	public BasePage basePage = new BasePage();

	public void enterUserName(String userName) {
		try {
			getUsername().sendKeys(userName);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		try {
			getPassword().sendKeys(password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void clickLoginButton() {
		try {
			getSignin().click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void enterFlightInformation(String tripType, String passengers, String departingFrom,
			String departingOnMonth, String departingOnDate, String arrivingIn, String returninigMonth,
			String returningDay) {
		
		try {
			if(tripType.equalsIgnoreCase("oneway")) {
				getTriptypeone().click();
			}
			else {
				getTriptyperound().click();
			}
			
			getPassengers().sendKeys(passengers);
			getDepartingfrom().sendKeys(departingFrom);
			getDepartingonmonth().sendKeys(departingOnMonth);
			getDepartingondate().sendKeys(departingOnDate);
			getArrivingin().sendKeys(arrivingIn);
			
			if(!returninigMonth.equalsIgnoreCase("NA")) {
				basePage.selectByText(getReturningmonth(), returninigMonth);
				basePage.selectByText(getReturningdate(), returningDay);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void chooseClassPrefrence(String serviceClass, String airLine) {
		try {
			if(serviceClass.equalsIgnoreCase("Economy")) {
				getEconomyserviceclass().click();
			}
			else if(serviceClass.equalsIgnoreCase("Business")) {
				getBusinessserviceclass().click();
			}
			else {
				getFirstserviceclass().click();
			}
			
			basePage.selectByText(getAirline(), airLine);
			getFindflights().click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
