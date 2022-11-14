package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement Loginlink()
    {

        return Hooks.driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]"));
    }
    public WebElement LoginName(){
        return  Hooks.driver.findElement(By.name("Email"));
    }
    public  WebElement LoginPass(){

        return  Hooks.driver.findElement(By.name("Password"));


    }
    public  WebElement LoginButton(){

        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));

    }
   /* public  WebElement AfterLoginPage(){
        return
    }*/
    public String currentURl(){
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement Myaccount(){
        return  Hooks.driver.findElement(By.className("ico-account"));
    }

    public WebElement MessageDisplayed(){
        return Hooks.driver.findElement(By.className("message-error"));
    }


}
