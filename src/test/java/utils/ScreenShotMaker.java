package utils;

import driver.manager.DriverManager;

import io.cucumber.java.AfterStep;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.File;


public class ScreenShotMaker {


public static void makeScreenShot()  {
    Allure.addAttachment("Any text1111", new ByteArrayInputStream(((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));

}


}