package com.cydeo.tests.day01_selnium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //Do Setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize the browsers page(Full screen)
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. Verify title:
        // Expected: Yahoo är en del av de varumärken i Yahoo-familjen
        String expectedTitle = driver.getTitle();

        //actual title comes from the browser
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. verification PASSED!");
        }else {
            System.out.println("Title is Not as expected. Verification FAILED!");
        }




    }

}
