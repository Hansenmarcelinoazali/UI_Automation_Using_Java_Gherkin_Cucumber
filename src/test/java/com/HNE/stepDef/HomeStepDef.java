package com.HNE.stepDef;

import com.HNE.BaseTest;
import com.HNE.Page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeStepDef extends BaseTest {
    private HomePage homePage;


    @Then("user will directed to homepage and see product {string}")
    public void userWillDirectedToHomepageAndSeeProduct(String product) {
        homePage = new HomePage(driver);
        homePage.ValidasiHomePage(product);
    }
//    @And("the price is")
//    public void thePriceIs() {
//        homePage.priceonHome();
//    }

    @And("user click purchase button")
    public void userClickPurchaseButton() {
        homePage.klikPurchase();
    }

    @And("user clik basket button and price same with homepage")
    public void userClikBasketButtonAndPriceSameWithHomepage() {

        homePage.basketButtonNPrice();
        System.out.println();
    }
}
