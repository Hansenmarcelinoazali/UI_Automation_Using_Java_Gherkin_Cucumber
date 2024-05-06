package com.HNE.Page;

import com.HNE.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseTest {
    WebDriver driver;
    protected String homePagePrice;

    By purchaseButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button");
    By basketButton = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    By priceInBasket = By.className("inventory_item_price");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ValidasiHomePage(String productName) {
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
        Assertions.assertTrue(webElement.isDisplayed());
        Assertions.assertEquals(productName, webElement.getText());
    }

//    public String priceonHome(){
//        return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")).getText();
//
//    }

    public void klikPurchase() {
        homePagePrice =driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")).getText();
        driver.findElement(purchaseButton).click();

    }


    public void basketButtonNPrice(){
        driver.findElement(basketButton).click();

        String dataBasket = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
        Assertions.assertEquals(homePagePrice,dataBasket);

        System.out.println(dataBasket);
        System.out.println(homePagePrice);

    }
}
