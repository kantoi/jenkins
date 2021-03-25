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

import com.typesafe.config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *
 * @author wahyu
 */
public class WebDriverInit {
    private Config conf;
    private WebDriver driver;
    private WebDriverWait longWaitDriver;
    private WebDriverWait shortWaitDriver;
    
    public WebDriverInit() {
        conf = Configuration.getWebDriverConfig();
  //      driver = newWebDriverInitialization();
        longWaitDriver = longWaitDriverInit();
        shortWaitDriver = shortWaitDriverInit();
    }
    
//    public WebDriver newWebDriverInitialization()
//    {
//        System.setProperty("webdriver.gecko.driver", conf.getString("driver.gecko.path"));
//        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
//        FirefoxBinary firefoxBinary = new FirefoxBinary();
////        firefoxBinary.addCommandLineOptions("--headless");
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setBinary(firefoxBinary);
//        FirefoxDriver driver = new FirefoxDriver();
//        return new FirefoxDriver(firefoxOptions);
//        
//    }
    
    public WebDriverWait longWaitDriverInit()
    {
        longWaitDriver = new WebDriverWait(this.driver, 
                conf.getInt("driver.wait.long.timeout"), 
                conf.getInt("driver.wait.long.sleep_time"));
        return longWaitDriver;
    }
    
    public WebDriverWait shortWaitDriverInit()
    
    {
        shortWaitDriver = new WebDriverWait(this.driver, 
                conf.getInt("driver.wait.short.timeout"), 
                conf.getInt("driver.wait.short.sleep_time"));
        return shortWaitDriver;
    }

    public Config getConf() {
        return conf;
    }

    public void setConf(Config conf) {
        this.conf = conf;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getLongWaitDriver() {
        return longWaitDriver;
    }

    public void setLongWaitDriver(WebDriverWait longWaitDriver) {
        this.longWaitDriver = longWaitDriver;
    }

    public WebDriverWait getShortWaitDriver() {
        return shortWaitDriver;
    }

    public void setShortWaitDriver(WebDriverWait shortWaitDriver) {
        this.shortWaitDriver = shortWaitDriver;
    }

    WebElement findElement(By xpath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
