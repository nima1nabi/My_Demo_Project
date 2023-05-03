package com.library.pages;

import com.library.utility.Driver;
import io.restassured.path.xml.XmlPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

/**
 * parent class for concrete Page object classes
 * provides constructor with initElements method for re-usability
 * abstract - to prevent instantiation.
 */
public abstract  class BasePage
{

    public BasePage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[.=\" Signup / Login\"]" )
    public WebElement signinBTN;

    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    public  WebElement signupMSG;
    @FindBy(xpath = "//input[@placeholder='Name']" )
    public  WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public  WebElement signupBTN;




/*lic void logOut(){
        accountHolderName.click();
        logOutLink.
                pubclick();
    }

    public void navigateModule(String moduleName){
        Driver.getDriver().findElement(By.xpath("//span[@class='title'][.='"+moduleName+"']")).click();
    }
}*/
}