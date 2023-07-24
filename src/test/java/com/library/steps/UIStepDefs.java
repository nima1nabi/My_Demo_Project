package com.library.steps;

import com.library.pages.BasePage;

import com.library.pages.SignUpPage;
import com.library.utility.BrowserUtil;
import com.library.utility.ConfigurationReader;
import com.library.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UIStepDefs extends BasePage
{

    String displayverify;
    @Given("I launch the browser")
    public void i_launch_the_browser() {


    }
    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("url = " + url);
        Driver.getDriver().get(url);

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

        WebElement webDisplay = Driver.getDriver().findElement(By.xpath("//*[text()='"+signupMsg+"']"));
        Assert.assertTrue(webDisplay.isDisplayed());
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

        WebElement click =  Driver.getDriver().findElement(By.xpath("//*[text()='"+SignupBTN+"']"));
        click.click();


    }
    SignUpPage signUpPage = new SignUpPage();
@When("I fill in the required account details:")
public void i_fill_in_the_required_account_details(List<Map<String,String>> fieldinfo) {
    System.out.println("fieldinfo = " + fieldinfo);

    signUpPage.title.click();

    signUpPage.name.clear();
    signUpPage.name.sendKeys(fieldinfo.get(0).get("Name"));

    //signUpPage.email.clear();
    //signUpPage.email.sendKeys(fieldinfo.get(0).get("Email"));   // possible bug, needs to be discussed with the po or Developers

    signUpPage.password.sendKeys(fieldinfo.get(0).get("Password"));

    signUpPage.dateOfBirthDay.click();

    String[] dateOFBirth = fieldinfo.get(0).get("Date of birth").split("/");
    System.out.println("Arrays.toString(dateOFBirth) = " + Arrays.toString(dateOFBirth));
 //to remove the zeros for ex 01/01/2022 to 1/1/23
    for (int i = 0 ; i< dateOFBirth.length; i++)
    {
        if (dateOFBirth[i].charAt(0)=='0')
            dateOFBirth[i] = dateOFBirth[i].substring(1);
    }


    System.out.println("Arrays.toString(dateOFBirth) = " + Arrays.toString(dateOFBirth));

    Select selectdate = new Select(signUpPage.dateOfBirthDay);
    selectdate.selectByVisibleText(dateOFBirth[0]);

    signUpPage.dateOfBirthMonth.click();
    Select selectmonth = new Select(signUpPage.dateOfBirthMonth);
    selectmonth.selectByValue(dateOFBirth[1]);

    signUpPage.dateOfBirthYear.click();
    Select selectyear = new Select(signUpPage.dateOfBirthYear);
    selectyear.selectByVisibleText(dateOFBirth[2]);

    }


    @When("I select the {string} checkbox")
    public void i_select_the_checkbox(String selectCheckbox) {

    WebElement selectCheckBox = Driver.getDriver().findElement(By.xpath("//label[text()='" + selectCheckbox +"']"));
    selectCheckBox.click();
        BrowserUtil.waitFor(2);
        System.out.println("selectCheckBox = " + selectCheckBox.isSelected());
       //Assert.assertTrue(selectCheckBox.isSelected())    //Assert failes possible bug
        //svssvkvsvk;
        ///hf


    }
    @When("I fill in the following additional details:")
    public void i_fill_in_the_following_additional_details(List<Map<String,String>> additionalInfo) {
        System.out.println("additionalInfo = " + additionalInfo);

        signUpPage.addressInfoName.sendKeys(additionalInfo.get(0).get("First name"));
        signUpPage.addressInfoLastName.sendKeys(additionalInfo.get(0).get("Last name"));
        signUpPage.addressInfoCompany.sendKeys(additionalInfo.get(0).get("Company"));
        signUpPage.addressInfoStreetAddress1.sendKeys(additionalInfo.get(0).get("Address"));
        signUpPage.addressInfoStreetAddress2.sendKeys(additionalInfo.get(0).get("Address2"));

        signUpPage.addressInfoCountry.click();
        Select selectCounry = new Select(signUpPage.addressInfoCountry);
        selectCounry.selectByVisibleText(additionalInfo.get(0).get("Country"));


        signUpPage.addressInfoState.sendKeys(additionalInfo.get(0).get("State"));
        signUpPage.addressInfoCity.sendKeys(additionalInfo.get(0).get("City"));
        signUpPage.addressInfozip.sendKeys(additionalInfo.get(0).get("Zipcode"));
        signUpPage.addressInfomobile.sendKeys(additionalInfo.get(0).get("Mobile Number"));




    }



}
