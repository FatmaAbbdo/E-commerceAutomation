package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;


public class D02_loginStepDef {
    P02_login logIn = new P02_login();
    SoftAssert softlogin = new SoftAssert();
    @Given("user go to login page")
    public void GotoLogin(){
        System.out.println("heeey");
        logIn.Loginlink().click();
    }
    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void LoginData(String VorINv,String Email, String Password){
        logIn.LoginName().sendKeys(Email);
        logIn.LoginPass().sendKeys(Password);

    }
    @And("user press on login button")
    public void LoginClick(){
        logIn.LoginButton().click();
    }
    @Then("user login to the system successfully")
    public void successLogin(){
        String Accualurl = logIn.currentURl();
        String excpectedurl = "https://demo.nopcommerce.com/";
        softlogin.assertEquals(Accualurl,excpectedurl);
        softlogin.assertTrue(logIn.Myaccount().isDisplayed());
        softlogin.assertAll();

    }
    @Then("user could not login to the system")
    public void FailedLogin(){
String Actualresult = logIn.MessageDisplayed().getText();

String expectedMessage = "Login was unsuccessful.";
softlogin.assertTrue(Actualresult.contains(expectedMessage));
String ActualColor = logIn.MessageDisplayed().getCssValue("color");
System.out.println(ActualColor);
      String NewColor =  Color.fromString(ActualColor).asHex(); //output will be #e4434b

String excpectedColor = "#e4434b";
softlogin.assertTrue(NewColor.contains(excpectedColor));
softlogin.assertAll();
    }
}
