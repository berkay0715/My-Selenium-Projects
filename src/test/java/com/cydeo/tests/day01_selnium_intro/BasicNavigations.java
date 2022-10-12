package com.cydeo.tests.day01_selnium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

    //1- Setup the browser driver (ALWAYS HAVE TO DO)
        WebDriverManager.chromedriver().setup();

    //2- create instance of the selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen(); // (same thing with the top but sometimes doesnt work for windows):
        //3- Go to "https://www.tesla.com
        driver.get("https://tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL =driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back(); // will take page to previous page

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward(); // will take page to forward page

        //Stop code execution for 3 seconds
        Thread.sleep(3000);
        //use selenium to navigate refresh
        driver.navigate().refresh(); // will refresh the current page

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate to method
        driver.navigate().to("https:www.google.com");

        //get the current title after getting the google page
        currentTitle= driver.getTitle();

        // get the title of the page
        //System.out.println("driver.getTitle = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        //Get current URL using selenium
        currentURL =driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this wil close the currently opened window
        driver.close();

        //this will close all of the opened window
        driver.quit();





    }

}
