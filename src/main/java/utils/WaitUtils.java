package utils;

import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
    public static void waitForJS(WebDriver driver) {
        new WebDriverWait(driver, 10).until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
            }
        });
    }
}

