package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UberEatsPage {

    public UberEatsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "// input[@name = 'searchTerm']")
    public WebElement deliveryInput;

    @FindBy(xpath = "// button[. = 'Find Food']")
    public WebElement findFoodButton;

    @FindBy (xpath = "//input[@role = 'combobox']")
    public WebElement searchFood;

    @FindBy (xpath = "//h3 [.='Trattoria Toscana']")
    public WebElement trattoriaToscana;

    @FindBy(xpath = "(//button[@aria-label ='Quick Add'])[20]")
    public WebElement selectMargarita;

    @FindBy(xpath ="//button[@aria-label ='Add 1 to order']" )
    public WebElement addToOrder;

    @FindBy(xpath = "//a[@rel ='nofollow']")
    public WebElement goToCheckOut;
}
