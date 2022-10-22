package com.cydeo.tests.selfPractice;

import com.cydeo.pages.RegisterUserPage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUser {

    @Test
    public void registerUser(){

        RegisterUserPage registerUserPage = new RegisterUserPage();
        Faker faker = new Faker();


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");



        //3. Verify that home page is visible successfully
       String actualTitle= Driver.getDriver().getTitle();
       String expectedTitle = "Automation Exercise";

        Assert.assertEquals(expectedTitle,actualTitle);

        //4. Click on 'Signup / Login' button
        registerUserPage.signUp_Login.click();

        //5. Verify 'New User Signup!' is visible
         String actualText = registerUserPage.newUSerSignup.getText();
         String expectedText = "New User Signup!";

         Assert.assertEquals(expectedText,actualText);


        //6. Enter name and email address
        registerUserPage.nameInput.sendKeys(faker.name().firstName());
        registerUserPage.emailAddressInput.sendKeys(faker.internet().emailAddress());

        //7. Click 'Signup' button
        registerUserPage.signUpButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String actualEnterAccountInfoText = registerUserPage.enterAccountInfoText.getText();
        String expectedEnterAccountInfoText = "ENTER ACCOUNT INFORMATION";

        Assert.assertEquals(expectedEnterAccountInfoText, actualEnterAccountInfoText);

        //9. Fill details: Title, Name, Email, Password, Date of birth
        registerUserPage.Title.click();
        System.out.println(registerUserPage.Title.isSelected()); //true

        registerUserPage.passwordInput.sendKeys(faker.internet().password());

        Select day = new Select(Driver.getDriver().findElement(By.xpath("//select[@data-qa = 'days']")));
        day.selectByVisibleText("25");

        Select month = new Select(Driver.getDriver().findElement(By.xpath("//select[@data-qa = 'months']")));
        month.selectByValue("10");

        Select year = new Select(Driver.getDriver().findElement(By.xpath("//select[@data-qa = 'years']")));
        year.selectByValue("2021");


        //10. Select checkbox 'Sign up for our newsletter!'
        registerUserPage.newsLetter.click();


        //11. Select checkbox 'Receive special offers from our partners!'
        registerUserPage.specialOffer.click();


        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        registerUserPage.firstName.sendKeys(faker.name().firstName());
        registerUserPage.lastName.sendKeys(faker.name().lastName());
        registerUserPage.company.sendKeys(faker.company().name());
        registerUserPage.address.sendKeys(faker.address().fullAddress());
        registerUserPage.address.sendKeys(faker.address().fullAddress());

        Select country = new Select(Driver.getDriver().findElement(By.id("country")));
        country.selectByVisibleText("United States");

        registerUserPage.state.sendKeys(faker.address().state());
        registerUserPage.city.sendKeys(faker.address().city());
        registerUserPage.zipcode.sendKeys(faker.address().zipCode());
        registerUserPage.mobileNumber.sendKeys(faker.phoneNumber().phoneNumber());


        //13. Click 'Create Account button'
         registerUserPage.createAccountbutton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
         String actualAccountCreated = registerUserPage.accountCreated.getText();
         String expectedAccountCreated = "ACCOUNT CREATED!";

         Assert.assertEquals(expectedAccountCreated,actualAccountCreated);

        //15. Click 'Continue' button
        registerUserPage.continueButton.click();

        //16. Verify that 'Logged in as username' is visible
         registerUserPage.LoggedInAsUsername.isDisplayed();


        //17. Click 'Delete Account' button
         registerUserPage.deleteAccount.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
      String actualAccountDeletedText = registerUserPage.accountDeleted.getText();
      String expectedAccountDeletedText = "ACCOUNT DELETED!";

      Assert.assertEquals(expectedAccountDeletedText,actualAccountDeletedText);



    }

}
