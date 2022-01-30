package com.cybertek.tests.day23_fluentwait_testng_overview;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentWaitdemoTest extends TestBase {
    @Test
    public void fluentWaitDemoTest() {

        driver.get(ConfigurationReader.getProperty("practice.base.url"));
//waiting 30 seconds for an element to be present on the page,checking
        //for it's presence once every 5 seconds
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                //any custom condition based on your situation can be added here
                return driver.findElement(By.className("h1y"));
            }


        });

    }
}