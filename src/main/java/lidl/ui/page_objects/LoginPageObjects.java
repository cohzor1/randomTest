package lidl.ui.page_objects;

import lidl.ui.locators.LoginPageLocators;
import lidl.utils.TestHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPageObjects {

    WebDriver driver;

    public LoginPageObjects (WebDriver driver) {this.driver=driver;}

    public void sendEmailAddres() {
        WebElement button = TestHelper.findElementByLocator(this.driver, LoginPageLocators.getEmailField());
        button.sendKeys("testing@stuff.com");
    }

    public void clickWeiter() {
        WebElement button = TestHelper.findElementByLocator(this.driver, LoginPageLocators.getWeiterButton());
        button.click();
    }

    public void assertInvalidEmailError() {
        WebElement button = TestHelper.findElementByLocator(this.driver, LoginPageLocators.getInvalidEmailErrorMessage());
        Assert.assertEquals(button.getText(), "Diese E-Mail-Adresse gehört zu keinem Lidl Konto. Versuche es erneut oder erstelle ein Konto.");
    }

}
