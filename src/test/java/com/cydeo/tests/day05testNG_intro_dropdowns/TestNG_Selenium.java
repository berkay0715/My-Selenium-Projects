package com.cydeo.tests.day05testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
      driver = WebDriverFactory.getDriver("chrome");

      //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test(){
    //Do browser driver setup


        //get "https://google.com"
        driver.get("https://google.com");

        //Assert: title is "Google"

        String expectedTitle= "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle, "Title is not matching here.");





    }

}
