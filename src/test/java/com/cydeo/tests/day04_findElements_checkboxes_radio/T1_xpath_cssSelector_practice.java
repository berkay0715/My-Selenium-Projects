package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password ");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector syntax #2
        WebElement homeLink2= driver.findElement(By.cssSelector("a[class='nav-link']"));

        // locate homeLink using cssSelector, href value
        WebElement homeLink3= driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        //locate header using cssSelector: locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

        //Locate header using xpath
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));



        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox= driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox2= driver.findElement(By.xpath("//input[@type='text']"));


        //Locate inputBox using xpath contains method
        WebElement inputBox4= driver.findElement(By.xpath("//input[contains(@pattern,'a-z0')]"));

        //e. “Retrieve password” button
        WebElement retrievePasswordBtn2 = driver.findElement(By.xpath("//button[@id ='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.


        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePasswordBtn2.isDisplayed() = " + retrievePasswordBtn2.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible





    }
}
