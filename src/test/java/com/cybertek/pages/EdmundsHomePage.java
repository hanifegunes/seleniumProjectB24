package com.cybertek.pages;

import com.cybertek.tests.TestBase;
import org.testng.Assert;
import static org.testng.Assert.*;

public class EdmundsHomePage extends BasePage {
    /*
   * automatically added by compiler
    * no args default constructor
   * super() call to parent class no args constructor
    ===> public  EdmundsHomePage(){
    super();
}
 */
    @Override
    public void isCurrentPage() {
     Assert.assertEquals(driver.getTitle(),"New Cars, Used Cars, Car Reviews and Pricing | Edmunds");
    }
}
