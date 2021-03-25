/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 *
 * @author kentvanlim
 */
public class WebDriverPrep {
    WebDriver driver;
    
    public WebDriver newWebDriverInitialization()
    {
        System.setProperty("webdriver.gecko.driver", "/Users/kentvanlim/NetBeansProjects/compass/driver/geckodriver");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        FirefoxBinary firefoxBinary = new FirefoxBinary();
////        firefoxBinary.addCommandLineOptions("--headless");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        FirefoxDriver driver = new FirefoxDriver(); 
        return new FirefoxDriver(firefoxOptions);
    }
       public static void launchBrowser(){
        System.setProperty("webdriver.gecko.driver", "/Users/kentvanlim/NetBeansProjects/compass/driver/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://frontelease-colemanite-co31.antikode.dev");
        
    }
}


