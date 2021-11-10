package PageObjects;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.HoverOptions;
import com.codeborne.selenide.SelenideElement;
import driver.manager.DriverManager;
import io.cucumber.java.bs.A;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;

public class StartPage {
    private SelenideElement btnDevice=$("[class=\"menu-dropdown\"]:nth-of-type(1)");
    private SelenideElement btnPhone =$("[class=\"menu-dropdown open\"] li:nth-of-type(1)>a");

public void hoverBtnDevice(){
    btnDevice.shouldBe(Condition.appear);
   btnDevice.hover();
}
public void clickOnButtonPhone(){
    btnPhone.click();
}

}
