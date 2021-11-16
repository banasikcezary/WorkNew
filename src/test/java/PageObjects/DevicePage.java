package PageObjects;

import Actions.SeleniumActions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DevicePage {

    private  SelenideElement btnOpenFilter=$("[class*='desktopFilterTrigger']");
    private  SelenideElement lnkFirtDevice=$("[data-qa=\"device list section0\"]");
    private  SelenideElement btnAddToBasket=$("[data-qa=\"PRD_AddToBasket\"]");

public void clickOnBtnOpenFilter(){
    btnOpenFilter.click();
}
public void chooseFirtDeviceWithList(){
    lnkFirtDevice.click();
}
public void clickOnAddToBasket(){
    SeleniumActions.jsClick(btnAddToBasket);
}


}
