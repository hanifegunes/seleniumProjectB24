package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    // this is a abstract Parent class for all page object classes
    //Webdriver variable just in case any of children need
    protected WebDriver driver;

        @FindBy(xpath ="//img[@alt='Home']" )
        public WebElement edmundsLogo;

        @FindBy(linkText = "New Car Pricing")
         public WebElement newCarPricingLink;

    public  BasePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
       // isCurrentPage();  automatically checks if correct page.when we create objects

    }

    public  void  gotoNewCarPricingPage(){
        newCarPricingLink.click();
    }
    /*
    abstract method to be implemented by child page object classes
    this is to verify that we are at current page
    using title of the page or anything other

     */
    public  abstract  void isCurrentPage ();

}
