package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage=new LibraryLoginPage();
    }


    @Test
    public void required_field_error_message_test(){

        //TC #1: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        //NOTE: FOLLOW POM DESIGN PATTERN


    }


    @Test
    public void invalid_email_format_error_message_test(){

        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        // created a beforeMethod so I didnt include the Driver.Driverget

        //3- Enter invalid email format
        libraryLoginPage.inputUsername.sendKeys("somethingWrong");

        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        //Expected: Please enter a valid email address.

    }


    @Test
    public void library_negative_login_test() throws InterruptedException {

        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Enter incorrect username or incorrect password
        Thread.sleep(3000);
        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password



        Thread.sleep(3000);

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordMessage.isDisplayed());


    }


    @AfterMethod
    public void tear_down_Method(){

        Driver.closeDriver();

    }


}
