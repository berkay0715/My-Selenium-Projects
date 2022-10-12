package com.cydeo.tests.day03_cssSelectors;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

    //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
    //1- Open a chrome browser
        WebDriver driver=  WebDriverFactory.getDriver("chrome");

    //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

    //3- Verify “remember me” label text is as expected:
    //Expected: Remember me on this computer
        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedMessage= "Remember me on this computer";
        String actualMessage = rememberMe.getText();

        if (expectedMessage.equalsIgnoreCase(actualMessage)){
            System.out.println("Text verification PASSED!");
        }else {
            System.out.println("Text verification FAILED!");
        }

    //4- Verify “forgot password” link text is as expected:
    //Expected: Forgot your password?
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));

        expectedMessage="Forgot your password?";
        actualMessage= forgotPassword.getText();

        if (expectedMessage.equalsIgnoreCase(actualMessage)){
            System.out.println("Forgot your password message verification PASSED!");
        }else {
            System.out.println("Forgot your password message verification FAILED!");
        }


    //5- Verify “forgot password” href attribute’s value contains expected:
    //Expected: forgot_password=yes

        String expctedInHref = "forgot_password=yes";
        String actualHrefAttributeValue=forgotPassword.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expctedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else {
            System.out.println("HREF attribute value verification FAILED!");
        }


    //PS: Inspect and decide which locator you should be using to locate web
    //elements.

        //cssSelector Practice
            //Practice num1 - locate "Label" using "class" attribute
            //tagName[attribute='Value']
            //label[class='login-item-checkbox-label']

        //cssSelector Practice2
        //Practice num2 - locate "Label" using "for" attribute
        //tagName[attribute='Value']
        //label[for='USER_REMEMBER']





    }
}
