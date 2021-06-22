package exam;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

	private WebElement webElement;

    @Before
    public void openIndexPage() {
        driver.get("https://demo.opencart.com");
    }

//    @AfterClass
//    public static void closeBrowser() {
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
}