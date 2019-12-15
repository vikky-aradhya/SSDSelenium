package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(name = "userName")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement signin;
	
	@FindBy(xpath = "//input[@value='oneway']")
	private WebElement triptypeone;
	
	@FindBy(xpath = "//input[@value='roundtrip']")
	private WebElement triptyperound;
	
	@FindBy(name = "passCount")
	private WebElement passengers;
	
	@FindBy(name = "fromPort")
	private WebElement departingfrom;
	
	@FindBy(name = "fromMonth")
	private WebElement departingonmonth;
	
	@FindBy(name = "fromDay")
	private WebElement departingondate;
	
	@FindBy(name = "toPort")
	private WebElement arrivingin;
	
	@FindBy(name = "toMonth")
	private WebElement returningmonth;
	
	@FindBy(name = "toDay")
	private WebElement returningdate;
	
	@FindBy(xpath = "//input[@value='Coach']")
	private WebElement economyserviceclass;
	
	@FindBy(xpath = "//input[@value='Business']")
	private WebElement businessserviceclass;
	
	@FindBy(xpath = "//input[@value='First']")
	private WebElement firstserviceclass;
	
	@FindBy(name = "airline")
	private WebElement airline;
	
	@FindBy(name = "findFlights")
	private WebElement findflights;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getTriptypeone() {
		return triptypeone;
	}

	public WebElement getTriptyperound() {
		return triptyperound;
	}

	public WebElement getPassengers() {
		return passengers;
	}

	public WebElement getDepartingfrom() {
		return departingfrom;
	}

	public WebElement getDepartingonmonth() {
		return departingonmonth;
	}

	public WebElement getDepartingondate() {
		return departingondate;
	}

	public WebElement getArrivingin() {
		return arrivingin;
	}

	public WebElement getReturningmonth() {
		return returningmonth;
	}

	public WebElement getReturningdate() {
		return returningdate;
	}

	public WebElement getEconomyserviceclass() {
		return economyserviceclass;
	}

	public WebElement getBusinessserviceclass() {
		return businessserviceclass;
	}

	public WebElement getFirstserviceclass() {
		return firstserviceclass;
	}

	public WebElement getAirline() {
		return airline;
	}

	public WebElement getFindflights() {
		return findflights;
	}

}
