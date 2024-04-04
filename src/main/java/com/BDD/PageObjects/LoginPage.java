package com.BDD.PageObjects;

import com.BDD.BasePage;
import com.BDD.Utils.Properties.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class LoginPage extends BasePage {

    // XPATHS:
    private static String txtEmail = "//input[@id='input-email']";

    private static String txtPassword = "//input[@id='input-password']";

    private static String btnLogin = "//input[@class='btn btn-primary']";

    private static String forgotttenPassLink = "//div[@class='form-group']//a[contains(@href,'forgotten')]";

    // METHODS:
    public static void enterUserName(String txtUsername){
        BrowserUtils.enterText(txtEmail, txtUsername);
    }

    public static void enterPassword(String Password){
        BrowserUtils.enterText(txtPassword, Password);
    }

    public static void clickLogin() {
        BrowserUtils.clickElement(btnLogin);
    }

    public static void clickForgottenPassword(){
        BrowserUtils.clickElement(forgotttenPassLink);
    }

}
