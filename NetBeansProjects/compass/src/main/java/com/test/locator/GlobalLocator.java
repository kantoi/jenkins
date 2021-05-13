/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.locator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author kentvanlim
 */
public class GlobalLocator {
    AppiumDriver<MobileElement> driver;
    public boolean a(){
try{
        MobileElement homeButton = (MobileElement) driver.findElementByAccessibilityId("HISTORY, tab, 3 of 5");
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	wait.until(ExpectedConditions.visibilityOf(homeButton));
        homeButton.click();
	return true;	
}catch(Exception e){
	return false;
}
    }
}