package org.example.stepDefinition;

import org.example.Pages.P09_ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.example.stepDefinition.Hooks.driver;

public class D09_ShoppingCartStepDef {
    P09_ShoppingCartPage addingData = new P09_ShoppingCartPage(driver);
    @Given("user navigate to products")
    public void wish() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
        Thread.sleep(2000);

    }

    @When("user click on add product to cart")
    public void addingProduct() throws InterruptedException {
        addingData.clickCart();

        Thread.sleep(3000);
    }

    @Then("the product added to cart")
    public void SuccessAdding(){
        String expectRes= driver.findElement(addingData.getAlertText()).getText();
        Assert.assertTrue(expectRes.contains("The product has been added "));

    }
}
