package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPage {

    public RegisterUserPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//a[@href ='/login']")
    public WebElement signUp_Login;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUSerSignup;

    @FindBy(xpath = "//input[@data-qa='signup-name']" )
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailAddressInput;

    @FindBy(xpath = "(//button[@type = 'submit'])[2]")
    public WebElement signUpButton;

    @FindBy(xpath = "//h2[@class = 'title text-center']")
    public WebElement enterAccountInfoText;

    @FindBy(id = "id_gender1")
    public WebElement Title;

    @FindBy(xpath = "//input[@type = 'password']")
    public WebElement passwordInput;

    @FindBy(xpath ="(//input[@type = 'checkbox'])[1]" )
    public WebElement newsLetter;

    @FindBy(xpath ="(//input[@type = 'checkbox'])[2]" )
    public WebElement specialOffer;

    @FindBy(xpath ="//input[@data-qa = 'first_name']" )
    public WebElement firstName;

    @FindBy(xpath ="//input[@data-qa = 'last_name']" )
    public WebElement lastName;

    @FindBy(xpath ="//input[@data-qa = 'company']" )
    public WebElement company;

    @FindBy(xpath ="//input[@data-qa = 'address']" )
    public WebElement address;

    @FindBy(xpath ="//input[@data-qa = 'address2']" )
    public WebElement address2;

    @FindBy(xpath ="//input[@data-qa = 'state']" )
    public WebElement state;

    @FindBy(xpath ="//input[@data-qa = 'city']" )
    public WebElement city;

    @FindBy(xpath ="//input[@data-qa = 'zipcode']" )
    public WebElement zipcode;

    @FindBy(xpath ="//input[@data-qa = 'mobile_number']" )
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement createAccountbutton;

    @FindBy(xpath ="//h2[@class = 'title text-center']" )
    public WebElement accountCreated;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//i[@class = 'fa fa-user']")
    public WebElement LoggedInAsUsername;

    @FindBy(xpath ="//a[@href = '/delete_account']" )
    public WebElement deleteAccount;

    @FindBy(xpath = "//h2[@class = 'title text-center']")
    public WebElement accountDeleted;


}