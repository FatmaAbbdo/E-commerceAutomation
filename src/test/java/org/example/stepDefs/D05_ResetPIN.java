package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_ResetPIN;
import org.testng.Assert;

public class D05_ResetPIN {
    P04_ResetPIN resetpin = new P04_ResetPIN();
    @Given("User click on Login button")
    public void Login(){
        resetpin.loginClick().click();

    }
    @When("user enter email {string}")
    public void Forget(String Email){
        resetpin.ForgetPass().click();
      resetpin.EnterEmail().sendKeys(Email);
      resetpin.RecoverButton().click();

    }
    @Then("Message is displayed")
    public void checkMsg(){

        String ExcpectedMsg = "Email with instructions has been sent to you.";
        String ActualMsg = resetpin.Msg().getText();
        Assert.assertTrue(ActualMsg.contains(ExcpectedMsg));

    }
}
