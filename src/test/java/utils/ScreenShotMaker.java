package utils;

import driver.manager.DriverManager;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;


public class ScreenShotMaker {

    @Attachment(value = "Page screenshot test failure", type = "image/png")
    public static byte[] makeScreenShot()  {
        byte[] screenshotFile = ((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES);

        return screenshotFile;
    }



}