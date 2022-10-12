package com.cydeo.tests.day05testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_SelectingSateFromDropDown {

    static WebDriver driver;
    @BeforeMethod
    public static void setUpMethod() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown ");
    }

    @Test
    public static void StateDropDown() throws InterruptedException {

        Select StateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        StateDropDown.selectByVisibleText("Illinois");

        Thread.sleep(3000);

        //4. Select Virginia
        StateDropDown.selectByVisibleText("Virginia");

        Thread.sleep(3000);

        //5. Select California
        StateDropDown.selectByVisibleText("California");

        Thread.sleep(3000);

        //6. Verify final selected option is California.

        String expectedOptionText = "California";
        String actualOptionText = StateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);

        //Use all Select options. (visible text, value, index)
        }

    }

