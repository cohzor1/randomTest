package lidl.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class TestHelper {
    private static final int TIMEOUT = 30;

    public static WebElement waitForElementWithReattempts(WebDriver webDriver, By locator) {
        try {
            Wait<WebDriver> wait = new FluentWait<>(webDriver)
                    .withTimeout(TIMEOUT, TimeUnit.SECONDS)
                    .pollingEvery(2, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .withMessage("Waiting for element ");
            wait.until(driver -> webDriver.findElement(locator));
        } catch (Exception e) {
            System.out.println("Timeout " + TIMEOUT + "seconds while waiting for " + locator + ".");
        }
        return webDriver.findElement(locator);
    }

    public static WebElement findElementByLocator(WebDriver driver, By byLocator) {
        return waitForElementWithReattempts(driver, byLocator);
    }

    public static By getByLocator(String locatorType, String locator) {
        By byLocator;
        switch (locatorType) {
            case "id": {
                byLocator = By.id(locator);
                break;
            }
            case "xpath": {
                byLocator = By.xpath(locator);
                break;
            }
            default:
                byLocator = By.cssSelector(locator);
        }
        return byLocator;
    }
}

