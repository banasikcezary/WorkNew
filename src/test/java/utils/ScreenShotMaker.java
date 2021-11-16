package utils;

import driver.manager.DriverManager;

import io.cucumber.core.api.Scenario;

import io.cucumber.java.AfterStep;
import io.qameta.allure.Allure;

import io.qameta.allure.model.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;


public class ScreenShotMaker {


//    @AfterStep
//public void makeScreenShot(Scenario scenario)  {
//        System.out.println("SPRAWDZENIEEEEEEE");
////        if(!scenario.getStatus().equals(Status.PASSED)){
////            System.out.println("@@@@@@@@@ cos sie wyjebalo");
////            Allure.addAttachment("Any text1111", new ByteArrayInputStream(((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));
////        }
//
//}


}