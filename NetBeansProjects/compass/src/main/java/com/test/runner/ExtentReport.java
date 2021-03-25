/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.runner;

/**
 *
 * @author kentvanlim
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ExtentReport {
static ExtentTest test;
static ExtentReports report;
@BeforeClass
public static void startTest()
{
report = new ExtentReports(System.getProperty("/Users/kentvanlim/Compass")+"ExtentReportResults.html");
test = report.startTest("ExtentDemo");

}
@Test
public void extentReportsDemo()
{
System.setProperty("webdriver.gecko.driver","/Users/kentvanlim/NetBeansProjects/compass/driver/geckodriver");
FirefoxDriver driver =new FirefoxDriver();
driver.get("https://www.google.co.in");
if(driver.getTitle().equals("Google"))
{
test.log(LogStatus.PASS, "Navigated to the specified URL");
}
else
{
test.log(LogStatus.FAIL, "Test Failed");
}
}
@AfterClass
public static void endTest()
{
report.endTest(test);
report.flush();
}
}
