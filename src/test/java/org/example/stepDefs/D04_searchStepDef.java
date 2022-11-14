package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePageSearch;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

public class D04_searchStepDef {
    P03_homePageSearch serch = new P03_homePageSearch();
    SoftAssert softsearch = new SoftAssert();
    @Given("test this value {string}")
    public void testthevalue(String productName){
   System.out.println("da5lt");
        serch.SearchItem().sendKeys(productName);
        serch.searchButton().click();

    }

    @Then("showReleventItems {string}")
    public void Checkvakues(String ProductName) throws InterruptedException {
        Thread.sleep(3000);
       String URl = serch.URLSearch();
       softsearch.assertTrue(URl.contains(ProductName));
      List<WebElement> listSearch = serch.SearchList();
      for(int i =0; i< listSearch.size(); i++){

         String text = listSearch.get(i).getText();

          System.out.println(text.toLowerCase() + "Searchresult");
          System.out.println(ProductName+ "ProductName");
         softsearch.assertTrue(text.toLowerCase().contains(ProductName));

      }
      softsearch.assertAll();

    }

    @Then("SelectReleventdata{string}")
    public void selectreleventdata(String arg0) throws InterruptedException {
        Thread.sleep(3000);
       int x =   serch.itemList().size();
       //System.out.println(x);
       softsearch.assertEquals(x,1);
       serch.itemList().get(x-1).click();
       String item = serch.itemName().get(x-1).getText();
       System.out.println(item);
      softsearch.assertTrue(item.contains(arg0));
      softsearch.assertAll();
    }

}
