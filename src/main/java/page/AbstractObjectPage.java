package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public abstract class AbstractObjectPage {
	
	protected WebDriver driver; 
	
	public AbstractObjectPage(WebDriver driver) { 
		this.driver = driver; 
		PageFactory.initElements(driver, this); 
	}

	public void openItem(String productName){
		driver.findElement(By.xpath("//div[contains(@class, 'product-layout') and .//a[text()='"+ productName +"']]//a")).click();
		WaitUtils.waitForJS(driver);
	}
}
