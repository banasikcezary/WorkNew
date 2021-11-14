package utils;

import driver.manager.DriverManager;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;


public class ScreenShotMaker {

    public static void makeScreenShot() {
        Allure.addAttachment("Fail test",new ByteArrayInputStream(((TakesScreenshot)DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));

    }

}