package exam;


import java.util.logging.Logger;
import org.junit.Test;
import page.ProductPage;
import page.MainPage;
import page.LaptopsNotebooksPage;


public class TestUI extends BaseTest {

    private MainPage mainPage = new MainPage(driver);
    private LaptopsNotebooksPage mp3Page = new LaptopsNotebooksPage(driver);
    private ProductPage productPage = new ProductPage(driver);
    private Logger logger = Logger.getGlobal();

    @Test
    public void testUI() {


        addAllItemsToCart();
    }


    private void addAllItemsToCart() {
        mainPage.clickButtonLaptopsNotebooks();
        mainPage.clickButtonShowAllLaptopsNotebooks();
        mainPage.openItem("HP LP3065");
        mainPage.clickButtonLaptopsNotebooks();
        mainPage.clickButtonShowAllLaptopsNotebooks();
        mainPage.openItem("MacBook");
        mainPage.openItem("MacBook Air");
        mainPage.openItem("MacBook Pro");
        mainPage.openItem("Sony VAIO");
        mainPage.clickButtonTablets();
        mainPage.openItem("Samsung Galaxy Tab 10.1");
        mainPage.clickButtonPhonesPDAs();
        mainPage.openItem("HTC Touch HD");
        mainPage.openItem("iPhone");
        mainPage.openItem("Palm Treo Pro");

    }
}

