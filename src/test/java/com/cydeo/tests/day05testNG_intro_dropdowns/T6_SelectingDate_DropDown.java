package com.cydeo.tests.day05testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_SelectingDate_DropDown {

    static WebDriver driver;


    @BeforeMethod
    public static void setUpMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
    }

    @Test
    public static void DateDropDown(){

        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));

        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));

        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using  : visible text
        yearDropDown.selectByVisibleText("1923");

        //Select month using   : value attribute
        monthDropDown.selectByValue("11");

        //Select day using : index number
        dayDropDown.selectByIndex(0);
        //
    }

}
