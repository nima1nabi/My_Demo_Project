package com.library.pages;

import com.library.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public SignUpPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    public WebElement title;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(id = "days" )
    public WebElement dateOfBirthDay;

    @FindBy(id = "months" )
    public WebElement dateOfBirthMonth;

    @FindBy(id = "years" )
    public WebElement dateOfBirthYear;


    //Addreddinfo
    @FindBy(xpath = "//input[@id = 'first_name']")
    public WebElement addressInfoName;

    @FindBy(xpath = "//input[@id = 'last_name']")
    public WebElement addressInfoLastName;

    @FindBy(xpath = "//input[@id = 'company']")
    public WebElement addressInfoCompany;

    @FindBy(xpath = "//input[@id = 'address1']")
    public WebElement addressInfoStreetAddress1;
    @FindBy(xpath = "//input[@id = 'address2']")
    public WebElement addressInfoStreetAddress2;

    @FindBy(xpath = "//input[@id = 'state']")
    public WebElement addressInfoState;

    @FindBy(xpath = "//select[@id = 'country']")
    public WebElement addressInfoCountry;
    @FindBy(xpath = "//input[@id = 'city']")
    public WebElement addressInfoCity;

    @FindBy(xpath = "//input[@id = 'zipcode']")
    public WebElement addressInfozip;

    @FindBy(xpath = "//input[@id = 'mobile_number']")
    public WebElement addressInfomobile;









}
