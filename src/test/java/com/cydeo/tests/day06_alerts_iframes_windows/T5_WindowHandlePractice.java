package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_WindowHandlePractice {

    //2. Create new test and make set ups
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows ");

    }

    @Test
    public void WindowHabdleTest(){

        //Stroinng the main page's windiw handle as a string is goog practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        System.out.println("Tilte before click: "+ actualTitle);

        //5. Click to: “Click Here” link

        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


        //6. Switch to new Window.
        Set <String> allWindowsHandles = driver.getWindowHandles();
        //window handle 1 - main windows
        //window handle 2 - 2nd window
        for (String each: driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+ driver.getTitle());

        }
        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = driver.getTitle();
        actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);

        actualTitle= driver.getTitle();
        System.out.println("Title after click:"+ actualTitle);
    }

    @AfterMethod
    public void TearDown(){
        driver.close();
    }

}
