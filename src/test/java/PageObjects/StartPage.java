package PageObjects;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

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
