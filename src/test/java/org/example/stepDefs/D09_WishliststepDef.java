package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_Wishlistpage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D09_WishliststepDef {
    P08_Wishlistpage wish = new P08_Wishlistpage();
    @When("user clicked on the item {string}")
    public void Favoriteselect(String item){
        wish.wishlist().get(2).click();


    }
    @Then("green message should appear")
    public void appearedMsg(){
        SoftAssert soft = new SoftAssert();
        String excpectedMsg = "The product has been added to your wishlist";
        String ActualMsg = wish.msg().getText();
        String color = wish.backgroundcolor().getCssValue("background-color");
        System.out.println(color);
        String excpectedcolor = "rgba(75, 176, 122, 1)";
        soft.assertTrue(ActualMsg.contains(excpectedMsg));
        soft.assertTrue(color.contains(excpectedcolor));
        soft.assertAll();
    }
 @Then("product should added to wishlist with the valid quantaty")
    public void bascket(){

     WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
     Boolean element = wait.until(ExpectedConditions.invisibilityOf(wish.msg()));
     if(element){
         wish.wishlistbascket().click();
         int x = Integer.parseInt(wish.qty().getAttribute("value"));
         //System.out.println();
         Assert.assertNotEquals(x, 0);

     }
 }
}
