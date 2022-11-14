package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_Slider {
    public List<WebElement> sliders(){
        return Hooks.driver.findElements(By.cssSelector("div[class=\"nivoSlider\"]>a[href]"));
    }
   /* public  WebElement URL(){
        return Hooks.driver
    }*/
}
