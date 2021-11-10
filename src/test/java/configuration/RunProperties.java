package configuration;

import driver.BrowserType;

public class RunProperties {


    public static String getGridUrl() {
        return PropertiesLoader.getPropertiesFromFile().getProperty("grid.url");
    }

    public static BrowserType getBrowserToRun() {
        return BrowserType.valueOf(PropertiesLoader.getPropertiesFromFile().getProperty("browser"));
    }

    public static boolean getIsRemoteRun() {
        return Boolean.parseBoolean(PropertiesLoader.getPropertiesFromFile().getProperty("is.remote.run"));
    }
}