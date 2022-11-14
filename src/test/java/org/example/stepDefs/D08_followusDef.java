package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followus;
import org.testng.Assert;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class D08_followusDef {
P07_followus follow = new P07_followus();
    @When("user click on {string}")
    public void ClickonLink(String socialname) throws InterruptedException {
        System.out.println(Hooks.driver.getCurrentUrl());
        follow.SocialLink(socialname).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());

    }
    @Then("user go to {string} tab")
    public void Comparelinks(String URL){
        String ActualURL = Hooks.driver.getCurrentUrl();
        Assert.assertTrue(ActualURL.contains(URL));
    }
}
