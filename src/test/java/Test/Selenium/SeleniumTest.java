package Test.Selenium;

import PageObjects.BasketPage;
import PageObjects.DevicePage;
import PageObjects.FilterPage;
import PageObjects.StartPage;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;


public class SeleniumTest {
    StartPage startPage=new StartPage();
BasketPage basketPage=new BasketPage();
DevicePage devicePage=new DevicePage();
FilterPage filterPage=new FilterPage();



    @After
    public void makeScreenShot(Scenario scenario)  {
        System.out.println("SPRAWDZENIEEEEEEE");
        if(!scenario.getStatus().equals(Status.PASSED)){
            System.out.println("@@@@@@@@@ cos sie wyjebalo");
            Allure.addAttachment("Any text1111", new ByteArrayInputStream(((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES)));
        }

    }



    @Given("Open browser and configuration")
    public void open_browser_and_configuration() {
        DriverUtils.setInitialConfiguration();
    }
    @When("Go to tmobile website")
    public void go_to_tmobile_website() {
DriverUtils.navigateToPage("https://www.t-mobile.pl/");
    }
    @When("Click on Devices")
    public void click_on_devices() {
startPage.hoverBtnDevice();
    }
    @When("Click on Phone")
    public void click_on_phone() {
startPage.clickOnButtonPhone();
    }
    @When("Filter by smartwatches")
    public void filter_by_smartwatches() {
devicePage.clickOnBtnOpenFilter();
filterPage.chooseSmartwatchFilter();
    }
    @When("Sort by price ascending")
    public void sort_by_price_ascending() {
filterPage.chooseValueWithDropDown();
filterPage.clickApproveFilter();
    }
    @When("Add first element to basket")
    public void add_first_element_to_basket() {
devicePage.chooseFirtDeviceWithList();
devicePage.clickOnAddToBasket();
    }
    @When("Open basket")
    public void open_basket() {
basketPage.chooseBuyLikeNewUser();
basketPage.chooseBuyNewNumer();
basketPage.clickNextStep();
    }
    @Then("Assert {string} in basket")
    public void assert_in_basket(String string) {
basketPage.assertFirstBasketElement(string);
    }
    @Then("Close browser")
    public void close_browser() {

        DriverManager.disposeDriver();
    }



}
