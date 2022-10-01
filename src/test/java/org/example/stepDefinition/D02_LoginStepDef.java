package org.example.stepDefinition;

import org.example.Pages.Logout;
import org.example.Pages.P02_LoginPage;
import org.example.Pages.data;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import static org.example.stepDefinition.Hooks.driver;

public class D02_LoginStepDef {
    P02_LoginPage logData= new P02_LoginPage(driver);
    data LoginData= new data();

    Logout checkalert = new Logout(driver);


    @Given("user open login")
    public void userOpenLoginPage() throws InterruptedException {
        logData.ClickLogin();

        Thread.sleep(4000);
    }

    @When("user enter valid \"email\" & \"password\"")
    public void AddLoginData(){
        logData.userLogin(LoginData.Email,LoginData.Password);
    }

    @And("user click on login button")
    public void CLickButton() throws InterruptedException {
        logData.ConfirmLoginData();
        Thread.sleep(4000);
    }

    @Then("user could login")
    public void SuccessRegistered(){
        WebElement expectRes= driver.findElement(checkalert.getAlertText());
        Assert.assertEquals(true, expectRes.isDisplayed());
    }
}
