package com.BDD.Utils;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
public class PropertiesUtil {

    public static Properties properties = new Properties();

    static FileInputStream fis;

    public static Properties loadApplicationProperties() {

        try {
            fis = new FileInputStream("src/test/resources/config/Application.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static Properties loadFrameworkProperties() {

        try {
            fis = new FileInputStream("src/test/resources/config/Framework.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static Properties loadUserProperties() {

        try {
            fis = new FileInputStream("src/test/resources/config/User.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
