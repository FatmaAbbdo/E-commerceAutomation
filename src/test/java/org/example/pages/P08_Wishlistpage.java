package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P08_Wishlistpage {
    public List<WebElement> wishlist(){
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement msg(){
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement backgroundcolor(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement wishlistbascket(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));

    }
    public WebElement qty(){
        return Hooks.driver.findElement(By.className("qty-input"));
    }
}
