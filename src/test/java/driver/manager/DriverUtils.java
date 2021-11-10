package driver.manager;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.html5.WebStorage;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class DriverUtils {

    public static void setInitialConfiguration() {

        setWebDriver(DriverManager.getWebDriver());
        Configuration.timeout=6000;
        DriverManager.getWebDriver().manage().window().maximize();

        clearBrowserCache();
        DriverManager.getWebDriver().manage().deleteAllCookies();

    }

    public static void navigateToPage(String pageUrl) {
        DriverManager.getWebDriver().navigate().to(pageUrl);


    }

}