package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {


    public static Properties getPropertiesFromFile() {
        String propertiesFilePath="src/main/resources/configuration.properties";

        InputStream inputStream=null;
        Properties properties = new Properties();
        try {
             inputStream = new FileInputStream(propertiesFilePath);

            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("Property file not found in " + propertiesFilePath);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}