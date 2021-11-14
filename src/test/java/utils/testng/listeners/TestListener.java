package utils.testng.listeners;

import driver.manager.DriverManager;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenShotMaker;

import java.io.ByteArrayInputStream;

public class TestListener implements ITestListener {

    private Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On test start "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On test start "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.info("Test {} failed!", result.getName());
       // ScreenShotMaker.makeScreenShot();
        Allure.addAttachment("Fail test",new ByteArrayInputStream(((TakesScreenshot)DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("Test {} skipped!", result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        logger.info("Test {} failed!", result.getName());
       // ScreenShotMaker.makeScreenShot();
        Allure.addAttachment("Fail test",new ByteArrayInputStream(((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}