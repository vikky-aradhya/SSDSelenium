package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BasePage;

public class RegisterPage extends BasePage {
	
	@FindBy(xpath = "//a[text()='REGISTER']")
	private WebElement registerbtn;
	
	@FindBy(name = "firstName")
	private WebElement firstnametxt;
	
	@FindBy(name = "lastName")
	private WebElement lastnametxt;
	
	@FindBy(name = "phone")
	private WebElement phonetxt;
	
	@FindBy(id = "userName")
	private WebElement emailtxt;
	
	@FindBy(name = "address1")
	private WebElement addresstxt;
	
	@FindBy(name = "city")
	private WebElement citytxt;
	
	@FindBy(name = "state")
	private WebElement statetxt;
	
	@FindBy(name = "postalCode")
	private WebElement postalcodetxt;
	
	@FindBy(name = "country")
	private WebElement countrytxt;
	
	@FindBy(id = "email")
	private WebElement usernametxt;
	
	@FindBy(name = "password")
	private WebElement passwordtxt;
	
	@FindBy(name = "confirmPassword")
	private WebElement confpasswordtxt;
	
	@FindBy(name = "register")
	private WebElement submitbtn;
	
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}

	public WebElement getFirstnametxt() {
		return firstnametxt;
	}

	public WebElement getLastnametxt() {
		return lastnametxt;
	}

	public WebElement getPhonetxt() {
		return phonetxt;
	}

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getAddresstxt() {
		return addresstxt;
	}

	public WebElement getCitytxt() {
		return citytxt;
	}

	public WebElement getStatetxt() {
		return statetxt;
	}

	public WebElement getPostalcodetxt() {
		return postalcodetxt;
	}

	public WebElement getCountrytxt() {
		return countrytxt;
	}

	public WebElement getUsernametxt() {
		return usernametxt;
	}

	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getConfpasswordtxt() {
		return confpasswordtxt;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
