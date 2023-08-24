package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	// Declaration
	@FindBy(id = "First Name")
	private WebElement firstNameTF;
	@FindBy(id = "Last Name")
	private WebElement lastNameTF;
	@FindBy(xpath = "//div[@id='Gender']/descendant::label/span[2]")
	private List<WebElement> genderRadioButtons;
	@FindBy(id = "Phone Number")
	private WebElement phonenumberTF;
	@FindBy(id = "Email Address")
	private WebElement emailaddressTF;
	@FindBy(id = "Password")
	private WebElement passwordTF;
	@FindBy(id = "Confirm Password")
	private WebElement confirmpasswordTF;
	@FindBy(id = "Terms and Conditions")
	private WebElement termsandconditionsCB;
	@FindBy(id = "Register")
	private WebElement registerbutton;

	// Initialization
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void createUserAccount(String firstname, String lastname, String expectedGender, String phonenumber,
			String emailaddress, String password, String confirmpassword) {
		firstNameTF.sendKeys(firstname);
		lastNameTF.sendKeys(lastname);

		for (WebElement element : genderRadioButtons) {
			String gender = element.getText();
			if (gender.equals(expectedGender)) {
				element.click();
				break;
			}
		}
		phonenumberTF.sendKeys(phonenumber);
		emailaddressTF.sendKeys(emailaddress);
		passwordTF.sendKeys(password);
		confirmpasswordTF.sendKeys(confirmpassword);
		termsandconditionsCB.click();
		registerbutton.click();
	}
}
