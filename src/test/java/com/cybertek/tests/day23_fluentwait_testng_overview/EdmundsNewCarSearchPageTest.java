package com.cybertek.tests.day23_fluentwait_testng_overview;

import com.cybertek.pages.EdmundsCarDetailsPage;
import com.cybertek.pages.EdmundsHomePage;
import com.cybertek.pages.EdmundsNewCarPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class EdmundsNewCarSearchPageTest extends TestBase {

  @Test
  public void serchForNewCarTest (){
    driver.get(ConfigurationReader.getProperty("edmunds.url"));
    EdmundsHomePage homePage = new EdmundsHomePage();
    homePage.isCurrentPage();
    homePage.gotoNewCarPricingPage();//BASEPAGE

    EdmundsNewCarPage newCarPage = new EdmundsNewCarPage();
    newCarPage.selectMake("Audi");
    newCarPage.selectModel("e-tron GT");
    newCarPage.selectMake("BMW");
    newCarPage.selectModel("i3");

    //TODO: fix this. maybe actions class
    //enter zipcode
    newCarPage.zipCode.clear();
    newCarPage.zipCode.sendKeys("22102");
    //click on Go
    newCarPage.goBtn.click();

    EdmundsCarDetailsPage carDetailsPage = new EdmundsCarDetailsPage();
    carDetailsPage.isCurrentPage();
    System.out.println("MSRP RANGE = " + carDetailsPage.msrpRange.getText());


  }


}
