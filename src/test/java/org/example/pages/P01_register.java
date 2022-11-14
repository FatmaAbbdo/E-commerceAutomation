package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement registerbutton()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-signUp\"]"));
    }
    public WebElement malechoice(){
        return  Hooks.driver.findElement(By.className("male"));
    }
    public WebElement Femalechoice(){
        return  Hooks.driver.findElement(By.className("female"));
    }
    public WebElement FirstName(){
        return  Hooks.driver.findElement(By.name("FirstName"));
    }
    public WebElement LastName(){
        return  Hooks.driver.findElement(By.name("LastName"));
    }
 public WebElement BirthDay(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
 }
 public  WebElement BirthMonth(){
        return  Hooks.driver.findElement(By.name("DateOfBirthMonth"));
 }
 public  WebElement YearBirth(){
        return  Hooks.driver.findElement(By.name("DateOfBirthYear"));
 }


public  WebElement Email() {
    return Hooks.driver.findElement(By.id("Email"));
}
public WebElement Password(){
      return   Hooks.driver.findElement(By.id("Password"));
}
public  WebElement ConfirmPassword(){
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
}
public  WebElement registerButton(){
        return  Hooks.driver.findElement(By.id("register-button"));
}
public WebElement afterReg(){
return Hooks.driver.findElement(By.className("result"));
}
/*public WebElement color(){
        return Hooks.driver.findElements(By.xpath("//*[contains(@style, 'background-color:#fff;')]"));
}*/

}
