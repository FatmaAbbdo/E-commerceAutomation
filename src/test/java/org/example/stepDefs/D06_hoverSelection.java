package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hoverpage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D06_hoverSelection {
     String Text = null;
 P05_hoverpage hover = new P05_hoverpage();
    @When("user hover the categories")
    public void hover(){
        int randomNumber = new Random().nextInt(3);
        List<WebElement> categories = hover.hoverlis();
       // System.out.println(categories.size());
        Actions ho = new Actions(driver);
        ho.moveToElement(categories.get(1)).perform();

       System.out.println(categories.get(1).getText());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> subCategories = hover.subcategoryList(2);
        System.out.println(subCategories.size());
        int newRandom = new Random().nextInt(3);
         Text = subCategories.get(newRandom).getText();
        subCategories.get(newRandom).click();

    }
    @Then("compare page line with the sub category text")
    public void Compare(){
       String ActualResult = hover.TitleText().getText().toLowerCase().trim();
       System.out.println(ActualResult + "ActualResult");
       String newText = Text.toLowerCase().trim();
       System.out.println(newText + "New Text");
        Assert.assertTrue(ActualResult.contains(newText));
    }

}
