package Actions;

import driver.manager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SeleniumActions {
    public static void jsClick (WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getWebDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public static void selectInDropDown(WebElement element, WebElement val){
        jsClick(element);
        jsClick(val);

    }
}
