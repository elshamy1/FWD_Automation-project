package org.example.stepDefinition;

import org.example.Pages.P06_HomeSliderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.example.stepDefinition.Hooks.driver;

public class D06_HomeSliderStepDef {
    P06_HomeSliderPage slid= new P06_HomeSliderPage(driver);
    @When("user can click on first slider")
    public void clickFirstSlider(){
        slid.setFirstSlid();

    }

    @Given("the first related product opened")
    public void RelatedFirstProduct(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/htc-one-mini-blue");
    }

    @When("user can click on second slider")
    public void clickSecSlider(){
        slid.setSecSlid();
    }

    @Given("the second related product will opened")
    public void RelatedSecProduct(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }
}
