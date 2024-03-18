package lidl.ui.locators;

import lidl.utils.TestHelper;
import org.openqa.selenium.By;

public class MainPageLocators {

    private enum Locators {
        Cookies("id", "onetrust-accept-btn-handler"),
        Login("xpath", "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div[1]/nav/ol/li[5]/ol/li[1]/a/span/span");


        private final String locatorType;
        private final String locator;

        Locators(String locatorType, String locator) {
            this.locatorType = locatorType;
            this.locator = locator;
        }
    }

    public static By getCookies() {
        String locator = Locators.Cookies.locator;
        return TestHelper.getByLocator(Locators.Cookies.locatorType, locator);
    }

    public static By getLogin() {
        String locator = Locators.Login.locator;
        return TestHelper.getByLocator(Locators.Login.locatorType, locator);
    }
}
