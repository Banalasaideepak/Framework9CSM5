package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myprofilepage {
	// Declaration
	@FindBy(xpath = "//div[text()='My Adresses']")
	private WebElement myAdressesLink;

	// Initialization
	public Myprofilepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void clickMyAdresses() {
		myAdressesLink.click();
	}
}
