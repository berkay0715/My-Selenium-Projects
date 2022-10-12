package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_ConfirmationAlert {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alert
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void ConfirmationAlert(){

        WebElement conformationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        //3. Click to “Click for JS Confirm” button
        conformationAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed());

    }


}
