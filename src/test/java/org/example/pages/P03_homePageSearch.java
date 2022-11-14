package org.example.pages;

import io.cucumber.java.en.Given;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePageSearch {
    public WebElement SearchItem(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public String URLSearch(){
        return Hooks.driver.getCurrentUrl();
    }
    public List<WebElement> SearchList(){
        return Hooks.driver.findElements(By.className("product-title"));
    }
    public List<WebElement> itemList(){
        return  Hooks.driver.findElements(By.className("product-item"));
    }
    public List<WebElement> itemName(){
        return Hooks.driver.findElements(By.className("sku"));
    }
}
