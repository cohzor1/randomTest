package lidl.ui.locators;

import lidl.utils.TestHelper;
import org.openqa.selenium.By;

public class LoginPageLocators {

    private enum Locators {
        EmailField("id", "field_EmailOrPhone"),
        WeiterButton("xpath", "/html/body/div[1]/form[1]/div/section/div/div/div[2]/div/div[2]/div/button"),
        InvalidEmailErrorMessage("xpath", "//p[@class='error_EmailOrPhone']");

        private final String locatorType;
        private final String locator;

        Locators(String locatorType, String locator) {
            this.locatorType = locatorType;
            this.locator = locator;
        }
    }

    public static By getEmailField() {
        String locator = LoginPageLocators.Locators.EmailField.locator;
        return TestHelper.getByLocator(LoginPageLocators.Locators.EmailField.locatorType, locator);
    }

    public static By getWeiterButton() {
        String locator = LoginPageLocators.Locators.WeiterButton.locator;
        return TestHelper.getByLocator(LoginPageLocators.Locators.WeiterButton.locatorType, locator);
    }

    public static By getInvalidEmailErrorMessage() {
        String locator = LoginPageLocators.Locators.InvalidEmailErrorMessage.locator;
        return TestHelper.getByLocator(LoginPageLocators.Locators.InvalidEmailErrorMessage.locatorType, locator);
    }
}

