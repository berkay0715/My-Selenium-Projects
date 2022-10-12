package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){

        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver.get(url)
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker object
        Faker faker = new Faker();

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name = 'firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name = 'lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name ='username']"));

        String user = faker.bothify("helpdesk###");

      inputUserName.sendKeys(user);

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name = 'email']"));
        inputEmail.sendKeys(user + "@email.com");


        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name = 'password']"));
        inputPassword.sendKeys(faker.numerify("########"));

        //8. Enter phone number
        WebElement inputNumber = Driver.getDriver().findElement(By.xpath("//input[@name = 'phone']"));
        inputNumber.sendKeys(faker.numerify("+46-07#-###-####"));

        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10. Enter date of birth
        WebElement inputBirthDay = Driver.getDriver().findElement(By.xpath("//input[@name = 'birthday']"));
        //faker.number().numberBetween(1,12);
        inputBirthDay.sendKeys("03/08/2000");

        //11. Select Department/Office
        Select departmentDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name = 'department']")));
        departmentDropDown.selectByIndex(faker.number().numberBetween(1,9));

        //12. Select Job Title
        Select jobTitleDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name ='job_title']")));
        jobTitleDropDown.selectByIndex(faker.number().numberBetween(1,10));

        //13. Select programming language from checkboxes
        WebElement programmingLanguage = Driver.getDriver().findElement(By.xpath("//input[@value ='java']"));
        programmingLanguage.click();

        //14. Click to sign up button
        WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        signUpButton.click();

        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.

        String expectedMessage = "Well done!";


        WebElement actualMessage = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));
         actualMessage.getText();



    }

}
