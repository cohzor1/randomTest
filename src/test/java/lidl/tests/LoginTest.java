package lidl.tests;

import lidl.ui.page_objects.LoginPageObjects;
import lidl.ui.page_objects.MainPageObjects;
import lidl.ui.test_data.TestData;
import lidl.utils.WebDriverController;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testMethod1() throws InterruptedException {
        WebDriver driver = WebDriverController.createDriverInstance();
        driver.get(TestData.websiteAddress);

        MainPageObjects mainPageObjects = new MainPageObjects(driver);
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

        mainPageObjects.acceptCookies();
        mainPageObjects.clickOnLogin();
        loginPageObjects.sendEmailAddres();
        loginPageObjects.clickWeiter();
        loginPageObjects.assertInvalidEmailError();
        driver.quit();


    }
}
