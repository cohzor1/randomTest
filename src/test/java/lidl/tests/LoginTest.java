package lidl.tests;

import lidl.ui.page_objects.LoginPageObjects;
import lidl.ui.page_objects.MainPageObjects;
import lidl.ui.test_data.TestData;
import lidl.utils.WebDriverController;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest {

/* Test Case: Login with an invalid email test case

Objective: To verify the system handles login attempts with invalid email addresses correctly.

Preconditions:
Accessible application.
Test user credentials available.

Test Steps:
Open login page.
Enter invalid email.
Enter valid password.
Click "Login".
Verify error message for invalid email.

Expected Results:
System displays error message for invalid email.
Focus remains on email field.

Test Data:
Invalid email: "testing@stuff.com"

Test Environment:
OS: Windows 10
Browser: Google Chrome 122.0.6261.129 */

    @Test
    public void testMethod1() {
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
