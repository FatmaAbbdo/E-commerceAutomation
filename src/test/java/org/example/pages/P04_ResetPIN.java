package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_ResetPIN {
    public WebElement loginClick(){
      return  Hooks.driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]"));
    }
    public WebElement ForgetPass(){
        return  Hooks.driver.findElement(By.xpath("//a[@href=\"/passwordrecovery\"]"));
    }
    public WebElement EnterEmail(){
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement RecoverButton(){
        return Hooks.driver.findElement(By.name("send-email"));
    }
    public WebElement Msg(){
        return Hooks.driver.findElement(By.className("content"));
    }
}
