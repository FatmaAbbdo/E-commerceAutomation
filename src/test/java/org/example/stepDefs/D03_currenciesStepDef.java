package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage Currencyselection = new P03_homePage();
    SoftAssert softcurr = new SoftAssert();

    @When("user select euro option")

    public void selectEuro(){

        Select select = new Select(Currencyselection.getList());
     select.selectByVisibleText("Euro");
    }
    @Then("euro symbol displayed on all products")
    public void checkCurrencies(){
        String symbol = "€";
       List<WebElement> productsList = Currencyselection.getproducts();
       for(int i = 0; i< productsList.size(); i++){
           String Actualnumber = productsList.get(i).getText();
           System.out.println(Actualnumber);
           Assert.assertTrue(Actualnumber.contains(symbol));


       }
       //softcurr.assertAll();
    }

}
