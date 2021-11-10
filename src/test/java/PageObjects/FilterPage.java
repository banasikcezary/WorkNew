package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;

import static Actions.SeleniumActions.jsClick;
import static Actions.SeleniumActions.selectInDropDown;
import static com.codeborne.selenide.Selenide.$;

public class FilterPage {

    private SelenideElement smartwatchOption =$("[data-qa=\"Kategoria5\"]");
    private  SelenideElement dropDownFilter=$("[data-qa=\"LST_SortByFilter\"]");
    private  SelenideElement choosePriceAscending=$("[data-qa=\"option1\"]");
    private  SelenideElement btnApproveFilter=$("[class*='styles__StyledFooterActions']>button:nth-of-type(2)");

    public void chooseSmartwatchFilter(){
        jsClick(smartwatchOption);
    }
    public void chooseValueWithDropDown(){
        selectInDropDown(dropDownFilter,choosePriceAscending);
    }
    public void clickApproveFilter(){
        btnApproveFilter.shouldHave(Condition.appear);
        btnApproveFilter.click();
    }


}
