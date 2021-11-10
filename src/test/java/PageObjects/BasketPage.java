package PageObjects;

import Actions.SeleniumActions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private SelenideElement btnBuyLikeNewUser=$("[data-qa=\"Presale_NewUserCta\"]");
    private SelenideElement rbtBuyNewNumber=$("[class*=\"OptionsList\"]>label");
    private  SelenideElement btnNextStep=$("[class*='dt_button primary']");
    private  SelenideElement firstBasketElement=$("[data-qa=\"BKT_ItemTitle0\"]");

    public void chooseBuyLikeNewUser(){

        SeleniumActions.jsClick(btnBuyLikeNewUser);
    }
    public void chooseBuyNewNumer(){
        SeleniumActions.jsClick(rbtBuyNewNumber);
    }
    public void clickNextStep(){
        SeleniumActions.jsClick(btnNextStep);
    }
    public void assertFirstBasketElement(String name){
        firstBasketElement.shouldHave(Condition.text(name));
    }


}
