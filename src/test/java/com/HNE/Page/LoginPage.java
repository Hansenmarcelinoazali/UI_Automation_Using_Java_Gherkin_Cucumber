package com.HNE.Page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By usernameInputText = By.id("user-name");
    By passwordInputText = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void InputUsername(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void InputPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void ClickLoginButton() {
        driver.findElement(loginButton).click();

    }

    public void ValidasiError(String errorMessage){
        Assertions.assertTrue(driver.getPageSource().contains(errorMessage));
//        String getText = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
//        validasiTest(getText);

    }
//    public void validasiTest(String textSebelum){
//
//    }
}
