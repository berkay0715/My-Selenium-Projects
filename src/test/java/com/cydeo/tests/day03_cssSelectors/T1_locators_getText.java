package com.cydeo.tests.day03_cssSelectors;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        //  WebDriverManager.chromedriver().setup();
        //  WebDriver driver = new ChromeDriver();
      WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement userNameInput = driver.findElement(By.name("USER_LOGIN"));
        userNameInput.sendKeys("incorrect"+ Keys.ENTER);

        //4- Enter incorrect password: “incorrect”
        WebElement userPasswordInput= driver.findElement(By.name("USER_PASSWORD"));
        userPasswordInput.sendKeys("incorrect"+ Keys.ENTER);

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

      WebElement errorMessage = driver.findElement(By.className("errortext"));

      String expectedErrorMessage = "Incorrect login or password";
      String actualErrorMessage = errorMessage.getText();

      if (expectedErrorMessage.equals(actualErrorMessage)){
          System.out.println("Error message verification PASSED!");
      }else {
          System.out.println("Error message verification FAILED!");
      }





        //PS: Inspect and decide which locator you should be using to locate web
        //elements.



    }
}
