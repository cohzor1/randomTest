package lidl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverController {
    static {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
    }

    public static WebDriver createDriverInstance() {
        WebDriver driver = null;
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito"); // starts chrome as incognito
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
            driver = new ChromeDriver(options);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return driver;
        }
    }

    public static void killSession(WebDriver driver) {
        driver.quit();
    }
}
