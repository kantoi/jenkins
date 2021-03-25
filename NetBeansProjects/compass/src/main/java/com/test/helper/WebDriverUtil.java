/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.helper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtil {
    
    public static WebElement waitDriverElementIsRendered(By locator,WebDriverWait waitDriver)
    {
        WebElement element = waitDriver.until(ExpectedConditions
                .presenceOfElementLocated(locator));
        return element;
    }
    
    public static WebElement waitDriverVisibilityOfElement(By locator, WebDriverWait waitDriver)
    {
        WebElement element = waitDriver.until(ExpectedConditions.
                visibilityOfElementLocated(locator));
        return element;
    }
    
    public static List<WebElement> waitDriverVisibilityOfElements(By locator, WebDriverWait waitDriver)
    {
        List<WebElement> element = waitDriver.until(ExpectedConditions.
                visibilityOfAllElementsLocatedBy(locator));
        return element;
    }
    
    public static boolean waitDriverUntilElementGone(By locator, WebDriverWait waitDriverShort)
    {
        WebElement element=null;
        boolean elementStillExisst = true;
        while(elementStillExisst)
        {
            element=null;
            try{
            element = waitDriverShort.until(
                    ExpectedConditions.visibilityOfElementLocated(locator));
            }catch(Exception ex){
                elementStillExisst= false;
                return true;
            }
            if(element == null) 
            {
                elementStillExisst=false;
                return true;
            }
            WebDriverUtil.sleepBeforeAnotherExecutions(800);
        }
        return false;
            
    }   
    public static void sleepBeforeAnotherExecutions(long milis)
    {
        try{Thread.sleep(milis);}catch(InterruptedException ie){ie.printStackTrace();}
    }
  
}

