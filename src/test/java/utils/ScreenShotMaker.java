package utils;

import driver.manager.DriverManager;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ScreenShotMaker {

    @Attachment(value = "Page screenshot test failure", type = "image/png")
    public static byte[] makeScreenShot() {
        byte[] screenShot = ((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        Allure.getLifecycle().addAttachment(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy_hh:mm:ss")), "image/png", "png", screenShot);
    return screenShot;
    }


}