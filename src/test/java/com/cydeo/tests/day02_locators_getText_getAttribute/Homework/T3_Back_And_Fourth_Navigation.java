package com.cydeo.tests.day02_locators_getText_getAttribute.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Back_And_Fourth_Navigation {
    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        Thread.sleep(2000);

        //3- Click to Gmail from top right.
        //WebElement Gmail = driver.findElement(By.className("gb_d"));
        //Gmail.click();

        WebElement gmailButton=driver.findElement(By.className("gb_d"));
        gmailButton.click();

        //4- Verify title contains:
        //  Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle =driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!");
        }
        Thread.sleep(2000);

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //  Expected: Google
        expectedTitle="Google";
        actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!");
        }

        driver.close();



    }
}
