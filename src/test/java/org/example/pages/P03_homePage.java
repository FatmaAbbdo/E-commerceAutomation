package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement getList(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> getproducts(){
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}
