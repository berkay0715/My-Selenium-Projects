package com.cydeo.tests.day02_locators_getText_getAttribute.Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Ornek {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.google.com");



    }

}
