package utils.testng.listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenShotMaker;

public class TestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test succes");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed");
        ScreenShotMaker.makeScreenShot();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skiped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test failed with in succes percentage");
        ScreenShotMaker.makeScreenShot();
    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }


}