package com.HNE.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MyStepdefs {
//
////    private ChromeDriver driver; ////untuk chromedriver local hasil download
//
//    WebDriver driver;
//
//    @Before
//    public void beforeTest() {
////     System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");////untuk chromedriver local hasil download
////        driver = new ChromeDriver();////untuk chromedriver local hasil download
//
//        driver = WebDriverManager.chromedriver().create();
//
//    }
//
//    @After
//    public void afterTest() {
//
//        driver.close();
//    }
//
//    @Given("user is on login page")
//    public void userIsOnLoginPage() {
//        driver.get("https://www.saucedemo.com/");
//
//    }
//
//    @And("user input username with {string}")
//    public void userInputUsernameWith(String usernameValue) {
//        By usernameInput = By.name("user-name");
//        driver.findElement(usernameInput).sendKeys(usernameValue);
//
//    }
//
//    @And("user input password with {string}")
//    public void userInputPasswordWith(String passwordValue) {
//        By passwordInput = By.id("password");
//        driver.findElement(passwordInput).sendKeys(passwordValue);
//    }
//
//    @And("user click login")
//    public void userClickLogin() {
//        By loginButton = By.name("login-button");
//        driver.findElement(loginButton).click();
//
//    }
//
//    @Then("user will directed to homepage and see product {string}")
//    public void userWillDirectedToHomepageAndSeeProduct(String product) {
//        By productBackPack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
//        WebElement productElement = driver.findElement(productBackPack);
//        assertTrue(productElement.isDisplayed());
//        assertEquals(product, productElement.getText());
//
//    }
//
//    @And("user get error message {string}")
//    public void userGetErrorMessage(String erMes) {
//        By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
//        String error= driver.findElement(errorMessage).getText();
//        assertEquals(erMes,error);
//    }


}
