package com.BDD.StepDefs;
import com.BDD.BasePage;
import com.BDD.PageObjects.LoginPage;
import com.BDD.StepDefs.Hooks;

import com.BDD.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginStepDefs extends BasePage {

    Properties properties = PropertiesUtil.loadUserProperties();;

    @Given("User enters a valid username in the username field")
    public void userEntersAValidUsernameInTheUsernameField() {
        String username = properties.getProperty("username");
        LoginPage.enterUserName(username);
    }

    @And("User enters a valid password in password field")
    public void userEntersAValidPasswordInPasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLogin();
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("User enters a invalid username in the username field")
    public void userEntersAInvalidUsernameInTheUsernameField() {
    }

    @And("User enters a invalid password in password field")
    public void userEntersAInvalidPasswordInPasswordField() {
    }

    @Then("User is not logged in the application")
    public void userIsNotLoggedInTheApplication() {
    }
}
