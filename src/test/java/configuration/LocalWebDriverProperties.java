package configuration;

public class LocalWebDriverProperties {


    public static String getChromeWebDriverLocation() {
        return PropertiesLoader.getPropertiesFromFile().getProperty("chrome.driver.location");
    }

    public static String getFirefoxWebDriverLocation() {
        return PropertiesLoader.getPropertiesFromFile().getProperty("firefox.driver.location");
    }

    public static String getInternetExplorerWebDriverLocation() {
        return PropertiesLoader.getPropertiesFromFile().getProperty("ie.driver.location");
    }
}