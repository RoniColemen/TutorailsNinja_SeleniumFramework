package com.BDD.Utils.Properties;

import com.BDD.BasePage;
import com.BDD.Utils.PropertiesUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BrowserUtils extends BasePage {

    static Properties properties = PropertiesUtil.loadFrameworkProperties();

    public static void clickElement(String element){
        findAndWaitForElement(element).click();
    }

    public static void enterText(String element, String text){
        findAndWaitForElement(element).clear();
        findAndWaitForElement(element).sendKeys(text);
    }

    public static WebElement findAndWaitForElement(String xpath){
        String timeout = properties.getProperty("timeout.maximum");
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(timeout)));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));

        }
        catch (Exception e){
            System.out.println("Element is not clickable");
        }
        return element;
    }
}
