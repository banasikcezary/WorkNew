package configuration;

public class AppUrls {


    public static String getMainUrl() {
        return PropertiesLoader.getPropertiesFromFile().getProperty("app.url");
    }

}