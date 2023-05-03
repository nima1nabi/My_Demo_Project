package com.library.steps;

import com.library.pages.BasePage;
import com.library.pages.BookPage;
import com.library.pages.LoginPage;
import com.library.utility.BrowserUtil;
import com.library.utility.ConfigurationReader;
import com.library.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UIStepDefs extends BasePage
{

    @Given("I launch the browser")
    public void i_launch_the_browser() {


    }
    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("I verify that the home page is visible successfully")
    public void i_verify_that_the_home_page_is_visible_successfully() {
       String actualHomePageaTitle =  Driver.getDriver().getTitle();
        System.out.println("actualHomePageaTitle = " + actualHomePageaTitle);
        String expectedHomepageTitle = "Automation Exercise";
        Assert.assertEquals(expectedHomepageTitle,actualHomePageaTitle);

    }
    @When("I click on the {string} button")
    public void i_click_on_the_button(String signupBtn) {
        signinBTN.click();



    }
    @Then("I verify that {string} is visible")
    public void i_verify_that_is_visible(String signupMsg) {
        Assert.assertTrue(signupMSG.isDisplayed());

    }
    @When("I enter my {string} and {string}")
    public void i_enter_my_and(String name, String email) {
        name = ConfigurationReader.getProperty("name");
        email = ConfigurationReader.getProperty("email");

        nameInput.sendKeys(name);
        emailInput.sendKeys(email);

    }
    @When("I click the {string} button")
    public void i_click_the_button(String SignupBTN) {
        signupBTN.click();


    }
    @When("I fill in the required account details:")
    public void i_fill_in_the_required_account_details(List<String> userinfo) {


    }
    @When("I select the {string} checkbox")
    public void i_select_the_checkbox(String string) {

    }
    @When("I fill in the following additional details:")
    public void i_fill_in_the_following_additional_details(io.cucumber.datatable.DataTable dataTable) {

    }



}
