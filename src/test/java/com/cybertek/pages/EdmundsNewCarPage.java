package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EdmundsNewCarPage extends BasePage {
    @FindBy(name="select-make")
    public WebElement make;

    @FindBy(name="select-model")
    public WebElement model;


    @FindBy(xpath = "//input[@data-tracking-id='new_cars_index_mmy_make_model_tab_zip_code_entry']")
    public  WebElement zipCode;

    @FindBy(xpath ="//button[@data-tracking-id='new_cars_index_mmy_make_model_tab_submit']" )
    public  WebElement goBtn;

    public  void selectMake(String carMake){
        Select makeDropdown = new Select(make);//creating select class object because it is dropdown
        makeDropdown.selectByVisibleText(carMake);

    }

    public void selectModel(String carModel) {
        Select modelDropDown = new Select(model);
        modelDropDown.selectByVisibleText(carModel);
    }

    @Override
    public void isCurrentPage() {
        Assert.assertEquals(driver.getTitle(),"New Cars, Used Cars, Car Reviews and Pricing | Edmunds");

    }





}
