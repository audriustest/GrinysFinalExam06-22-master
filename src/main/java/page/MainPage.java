package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WaitUtils;

public class MainPage extends AbstractObjectPage {

	// get buttons
	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement buttonLaptopsNotebooks;

	@FindBy(linkText = "Show All Laptops & Notebooks")
	private WebElement buttonShowAllLaptopsNotebooks;

	@FindBy(linkText = "Tablets")
	private WebElement buttonTablets;

	@FindBy(linkText = "Phones & PDAs")
	private WebElement buttonPhonesPDAs;

	
	// create constructor
	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void clickButtonLaptopsNotebooks() {
		buttonLaptopsNotebooks.click();
	}

	public void clickButtonShowAllLaptopsNotebooks() {
		buttonShowAllLaptopsNotebooks.click();
		WaitUtils.waitForJS(driver);
	}

	public void clickButtonTablets() {
		buttonTablets.click();
	}

	public void clickButtonPhonesPDAs() {
		buttonPhonesPDAs.click();
	}
}
