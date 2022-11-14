package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_followus {
    public WebElement SocialLink(String link){
       return Hooks.driver.findElement(By.cssSelector("li[class=\""+link+"\"]>a[href]"));
    }

}
