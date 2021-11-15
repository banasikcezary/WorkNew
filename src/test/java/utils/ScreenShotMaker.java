package utils;

import com.codeborne.selenide.Screenshots;
import driver.manager.DriverManager;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ScreenShotMaker {
    @AfterStep
    public static void makeScreenShot() {
       // Allure.addAttachment("Fail test",new ByteArrayInputStream(((TakesScreenshot)DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));

                try {
                    Allure.addAttachment("Failed step", new FileInputStream(Screenshots.takeScreenShotAsFile()));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }



}