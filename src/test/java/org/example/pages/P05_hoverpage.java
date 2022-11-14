package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_hoverpage {

    public List<WebElement> hoverlis(){
        return Hooks.driver.findElements(By.cssSelector("ul[class= \"top-menu notmobile\"]>li>a[href]"));
    }
    public List<WebElement> subcategoryList(int indexNumber){
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+indexNumber+"]/ul[@class=\"sublist first-level\"]/li/a[@href]"));
    }
    public WebElement TitleText(){
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

}
