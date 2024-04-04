package com.BDD;

import com.BDD.Utils.PropertiesUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BasePage {

    public static WebDriver driver;

    public void initializeDriver() {
        Properties properties = PropertiesUtil.loadApplicationProperties();
        String URL = properties.get("application.url").toString();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();
    }

//    public void teardown(){
//        driver.quit();
//    }
}
