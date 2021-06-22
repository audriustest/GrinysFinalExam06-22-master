package exam;


import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.ProductPage;
import page.MainPage;
import page.LaptopsNotebooksPage;


public class TestUI extends BaseTest {

    private MainPage mainPage = new MainPage(driver);
    private LaptopsNotebooksPage laptopsNotebooksPage = new LaptopsNotebooksPage(driver);
    private ProductPage productPage = new ProductPage(driver);
    private Logger logger = Logger.getGlobal();

    @Test
    public void testUI() {
        checkAllItemsAvailability();
    }

    private void checkAllItemsAvailability() {
        mainPage.clickButtonLaptopsNotebooks();
        mainPage.clickButtonShowAllLaptopsNotebooks();
        mainPage.openItem("HP LP3065");
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul[1]/li[4]"));
        String strng = element.getText();
        Assert.assertEquals("Availability: In Stock", strng);
        mainPage.clickButtonLaptopsNotebooks();
        mainPage.clickButtonShowAllLaptopsNotebooks();
        mainPage.openItem("MacBook");
        mainPage.clickButtonLaptopsNotebooks();
        mainPage.clickButtonShowAllLaptopsNotebooks();
        mainPage.openItem("MacBook Air");
        mainPage.clickButtonLaptopsNotebooks();
        mainPage.clickButtonShowAllLaptopsNotebooks();
        mainPage.openItem("MacBook Pro");
        mainPage.clickButtonLaptopsNotebooks();
        mainPage.clickButtonShowAllLaptopsNotebooks();
        mainPage.openItem("Sony VAIO");
        mainPage.clickButtonTablets();
        mainPage.openItem("Samsung Galaxy Tab 10.1");
        mainPage.clickButtonPhonesPDAs();
        mainPage.openItem("HTC Touch HD");
        mainPage.clickButtonPhonesPDAs();
        mainPage.openItem("iPhone");
        mainPage.clickButtonPhonesPDAs();
        mainPage.openItem("Palm Treo Pro");

    }

    private void assertEquals(String availability, String strng) {
    }
}

