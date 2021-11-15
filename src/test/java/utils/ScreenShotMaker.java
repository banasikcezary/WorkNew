package utils;

import driver.manager.DriverManager;

import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.core.api.Scenario;

import java.io.ByteArrayInputStream;
import java.io.File;


public class ScreenShotMaker {

    @After
public static void makeScreenShot(Scenario scenario)  {
    try {
        System.out.println("SPRAWDZENIEEEEEEE");
        if(!scenario.getStatus().equals(Status.PASSED)){
            System.out.println("@@@@@@@@@ cos sie wyjebalo");
            Allure.addAttachment("Any text1111", new ByteArrayInputStream(((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));
        }
    }catch (Exception e){
        System.out.println(e);
    }


}


}