package com.HNE.stepDef;

import com.HNE.BaseTest;
import com.HNE.Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.logging.Log;


public class LoginStepDef extends BaseTest {

  private   LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        if (driver == null) {
            getDriver();  // Memastikan WebDriver diinisialisasi
        }
        loginPage = new LoginPage(driver);
        loginPage.gotoLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String usernameVal) {
        loginPage.InputUsername(usernameVal);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String passwprdVal) {
        loginPage.InputPassword(passwprdVal);
    }

    @And("user click login")
    public void userClickLogin() {
        loginPage.ClickLoginButton();
    }


    @Then("user get error message {string}")
    public void userGetErrorMessage(String errorMessage) {
        loginPage.ValidasiError(errorMessage);
    }
}
