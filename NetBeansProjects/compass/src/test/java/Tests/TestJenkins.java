/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author kentvanlim
 */

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.test.function.GlobalFunctionTestNg;
import java.io.File;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class TestJenkins {
    // Create global variable which will be used in all method

    ExtentReports extent;
    ExtentTest test;
    WebDriver driver = newWebDriverInitialization();
    WebDriverWait wait = waitTimeout();
    GlobalFunctionTestNg func = new GlobalFunctionTestNg();
    String baseurl="https://frontelease-colemanite-co31.antikode.dev";
    String indexWarnaHitam ="1"; 
    String indexWarnaBiru ="2";   
    String indexWarnaCoklat ="3";   
    String indexWarnaHijau ="4";
    String indexWarnaAbu="5";
    String bagianQuarter="Quarter";
    String bagianGazelleLogo="Gazelle\\ Logo";
    String bagianEyeStay="Eyestay";
    String bagianBinding="Binding";
    String gecko="webdriver.gecko.driver";
    String geckoPath="/Users/kentvanlim/NetBeansProjects/compass/driver/geckodriver";
    String reportPath="/Users/kentvanlim/Compass/ReportCompass.html";
    
    
    

    
    public WebDriver newWebDriverInitialization() {
        System.setProperty("webdriver.gecko.driver", "/Users/kentvanlim/NetBeansProjects/compass/driver/geckodriver");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
 //       FirefoxBinary firefoxBinary = new FirefoxBinary();
//        firefoxBinary.addCommandLineOptions("--headless");
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setBinary(firefoxBinary);
        FirefoxDriver driver = new FirefoxDriver();
        return driver;

    }

    public WebDriverWait waitTimeout() {
        WebDriverWait waitVisible = new WebDriverWait(driver, 10, 5000);
        return waitVisible;

    }

    // This code will run before executing any testcase
//    @BeforeMethod
//    public void setup() {
//        ExtentHtmlReporter reporter = new ExtentHtmlReporter("/Users/kentvanlim/Compass/ReportCompass.html");
//
//        extent = new ExtentReports();
//
//        extent.attachReporter(reporter);
//
//    }
    @BeforeTest
    public void initiateBrowser(){ 
        ExtentHtmlReporter reporter = new ExtentHtmlReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        test = extent.createTest("Navigated to Url");
        System.setProperty(gecko, geckoPath);
        driver.get(baseurl);
        validateLog(driver.getTitle().equals("Home | Compass Xpresi"), "Navigated to Url", "Failed to Navigated to url");
        driver.manage().window().maximize();
    }
    

      @Test(enabled = true,description="Test Get Text")
    public void TestJenkins() throws IOException {
         validateLog(func.getInfoCampaign(wait), "Dapetin Text","Ga Dapet Text");
       
    }

    public Boolean moveTab() {
        try {
            ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
            //switch to new tab
            driver.switchTo().window(newTb.get(0));
            return false;
        } catch (Exception e) {
            return false;
        }

    }

   
    public static void sleepBeforeAnotherExecutions(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void validateLog(Boolean condition, String successMessage, String failedMessage) {
        if (condition == false) {
            test.log(Status.PASS, successMessage);
        } else {
            test.log(Status.FAIL, failedMessage);
         
            //      test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        }

    }

    // This will run after testcase and it will capture screenshot and add in report
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        extent.flush();
    //   	driver.quit();

    }

}
