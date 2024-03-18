package lidl.ui.page_objects;

import lidl.ui.locators.MainPageLocators;
import lidl.utils.TestHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObjects {

    WebDriver driver;

    public MainPageObjects (WebDriver driver) {this.driver=driver;}

    public void acceptCookies() {
        WebElement button = TestHelper.findElementByLocator(this.driver, MainPageLocators.getCookies());
        button.click();
    }

    public void clickOnLogin() {
        WebElement button = TestHelper.findElementByLocator(this.driver, MainPageLocators.getLogin());
        button.click();
    }
}

