package com.cydeo.tests.day02_locators_getText_getAttribute.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Task2 {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com ");

        Thread.sleep(2000);

        //3. Enter incorrect username
        WebElement UsernamePlaceHolder = driver.findElement(By.name("email"));
        UsernamePlaceHolder.sendKeys("incorrectUserName@gmail.com"+ Keys.ENTER);

        //4. Enter incorrect password
        WebElement passwordPlaceHolder = driver.findElement(By.name("pass"));
        passwordPlaceHolder.sendKeys("incorrectPassowrd"+ Keys.ENTER);

        Thread.sleep(2000);

        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        String expectedTitle = "Log in to Facebook";

        Thread.sleep(5000);

        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }



    }
}
