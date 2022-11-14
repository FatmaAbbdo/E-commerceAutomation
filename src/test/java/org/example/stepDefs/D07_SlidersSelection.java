package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_Slider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D07_SlidersSelection {
    P06_Slider sliders = new P06_Slider();
    @When("user slide with {string}")
    public void selectSlider(String index){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"nivoSlider\"]/a["+index+"] [@style=\"display: block;\"]")));
       if(index == "1"){
           sliders.sliders().get(0).click();
       }
       else if(index == "2"){
           sliders.sliders().get(1).click();
       }

    }
    @Then("user click on slider {string}")
    public void currentURL(String Mobilename){
        String URL= Hooks.driver.getCurrentUrl();
        System.out.println(URL);
        Assert.assertTrue(URL.contains(Mobilename));

    }
}
