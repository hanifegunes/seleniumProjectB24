package com.cybertek.utils;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtils {

public static void sleep(int seconds){
    try{
        Thread.sleep(seconds*1000);
    }catch (InterruptedException e){
        e.printStackTrace();
        System.out.println("Exception happened in sleep method");
    }
}
public static void scrollDown(int pixels){
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    js.executeScript("window.scroll(0,"+pixels+")");
}
}
