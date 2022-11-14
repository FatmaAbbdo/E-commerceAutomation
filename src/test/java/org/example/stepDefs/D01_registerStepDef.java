package org.example.stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

   // SoftAssert soft =
    P01_register register = new P01_register();


    @Given("user go to register page")
    public void Register(){
        System.out.println("This is a test before start coding");
        register.registerlink().click();

// Note: you will need to apply pom design pattern later on, but now let's focus first on running   your cucumber scenarios

    }
    @When("user select gender type")
    public void MaleSelect(){
        register.malechoice().click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
            public void FirstLast(String FirstName, String LastName){
           register.FirstName().sendKeys(FirstName);
           register.LastName().sendKeys(LastName);
            }

            @And("user enter date of birth")
    public void BirthDate(){
        Select select = new Select(register.BirthDay());
        select.selectByIndex(10);
        select = new Select(register.BirthMonth());
        select.selectByIndex(01);
        select = new Select(register.YearBirth());
       // System.out.println();
        select.selectByIndex(3);

            }
            @And("user enter email {string} field")
    public void EmailData(String email){
        register.Email().sendKeys(email);
            }
            @And("^user fills Password fields \"(.*)\" \"(.*)\"$")

            public void Password(String pasword, String Confirmpassword){
        register.Password().sendKeys(pasword);
        register.ConfirmPassword().sendKeys(Confirmpassword);
            }
            @And("user clicks on register button")
    public void Clickbutton() throws InterruptedException {
        register.registerButton().click();
        Thread.sleep(3000);
            }
            @Then("success message is displayed")
    public void SuccessMsg(){
        SoftAssert soft = new SoftAssert();
       String ActualResult = register.afterReg().getText();
       String ExcpectedResult = "Your registration completed";
                soft.assertTrue(ActualResult.contains(ExcpectedResult));
                String Actualcolor =   register.afterReg().getCssValue("color");
                //System.out.println(Actualcolor);
                String ExcpectedColor = "rgba(76, 177, 124, 1)";
                soft.assertTrue(Actualcolor.contains(ExcpectedColor));
                soft.assertAll();

            }

}
