package com.cydeo.tests.day06_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownPractices {

    WebElement driver;

    @Test
    public void dropdown_task5(){

        Select StateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        StateDropDown.selectByVisibleText("Illinois");

        //4. Select Virginia
        StateDropDown.selectByVisibleText("Virginia");

        //5. Select California
        StateDropDown.selectByVisibleText("California");

        //6. Verify final selected option is California.

        String expectedOptionText = "California";
        String actualOptionText = StateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);

        //Use all Select options. (visible text, value, index)
    }
}
