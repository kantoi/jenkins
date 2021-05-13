/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import com.aventstack.extentreports.reporter.KlovReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.test.function.GlobalFunctionTestNg;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class KlovReport {
    // Create global variable which will be used in all method
    

private static KlovReporter klov;
private static Date d;
private static ExtentHtmlReporter htmlReporter;
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
//    public void initiateBrowser(){ 
//        ExtentHtmlReporter reporter = new ExtentHtmlReporter(reportPath);
//        extent = new ExtentReports();
//        extent.attachReporter(reporter);
//        test = extent.createTest("Navigated to Url");
//        System.setProperty(gecko, geckoPath);
//        driver.get(baseurl);
//        validateLog(driver.getTitle().equals("Home | Compass Xpresi"), "Navigated to Url", "Failed to Navigated to url");
//        driver.manage().window().maximize();
//    }
    
    @BeforeClass
    public  void initialize(){
    d = new Date();
    extent = new ExtentReports();
    klov = new KlovReporter();
    htmlReporter = new ExtentHtmlReporter("ExtentReport.html");

    htmlReporter.setAppendExisting(true);
    htmlReporter.config().setChartVisibilityOnOpen(true);
    htmlReporter.config().setDocumentTitle("Klov Example");
    htmlReporter.config().setReportName("Test");
    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
    htmlReporter.config().setTheme(Theme.STANDARD);

    klov.initMongoDbConnection("localhost",27017);
    klov.setProjectName("Compass Project");
    klov.setReportName("Test" + d.toString());
    klov.setKlovUrl("http://localhost:8443");

    extent.attachReporter(htmlReporter, klov);

  //  extent.createTest("ROF");
    
        test = extent.createTest("Navigated to Url");
        System.setProperty(gecko, geckoPath);
        driver.get(baseurl);
        validateLog(driver.getTitle().equals("Home | Compass Xpresi"), "Navigated to Url", "Failed to Navigated to url");
        driver.manage().window().maximize();
}

    

    public String captureScreen(String namaFile) throws IOException {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File src = screen.getScreenshotAs(OutputType.FILE);
        String dest = "/Users/kentvanlim/Compass/TestImage/" + namaFile + ".png";
        File target = new File(dest);
        FileUtils.copyFile(src, target);
        return dest;
    }

//    @Test(enabled=false)
//    public void getUrl() {
//        test = extent.createTest("Mulai Test");
//        System.setProperty("webdriver.gecko.driver", "/Users/kentvanlim/NetBeansProjects/compass/driver/geckodriver");
//        driver.get("https://frontelease-colemanite-co31.antikode.dev");
//        validateLog(driver.getTitle().equals("Home | Compass Xpresi"), "Navigated to Url", "Failed to Navigated to url");
//        driver.manage().window().maximize();
//    }

    @Test(priority = 2, enabled = true)
    public void kirimDesain() {
        test = extent.createTest("Mulai Test Compass");
        validateLog(func.clickFb(wait), "Clicked Fb Icon", "Failed to click Fb");
        validateLog(moveTab(), "Moved to Main Tab", "Failed to Move Tab");
        validateLog(func.clickDesain(wait), "Clicked Mulai Desain", "Failed to Click Mulai Desain");
        validateLog(func.pilihGazelleHi(wait), "Clicked Gazelle Option Hi", "Failed to click Gazelle Option Hi");
        validateLog(func.gazelleHiCustomByIndex(wait, "3"), "Click custom part of the shoe index 3 from left", "Failed to select custom part of the shoe index 3 from left");
        validateLog(func.gazellePilihWarnaByIndexdanBagianCustom(wait, "3", "Eyestay"), "Click colour index 5 from left", "Failed to click colour index 5 from left");
        validateLog(func.confirmCustom(wait, "Eyestay"), "Click checklist ", "Failed to click checklist");
        validateLog(func.kirimDesain(wait), "Click Kirim Desain Button", "Failed to click Kirim Desain Button");
        validateLog(func.confirmasiKirimDesain(wait), "Click ya to send design", "Failed to click ya");
        validateLog(func.isiData(wait, "fullName", "Ujang"), "Success to fill name in BioData", "Failed to fill Name");
        validateLog(func.isiData(wait, "email", "Ujang@gmail.com"), "Success to fill Email", "Failed to fill email");
        validateLog(func.isiData(wait, "phoneNumber", "08121212121"), "Success to fill Phone Number", "Failed to fill Phone Number");
        validateLog(func.clickCalenderIcon(wait), "Success click icon calendar", "Failed to click icon calendar");
        validateLog(func.pilihTanggal(wait, "6"), "Success to choose date", "Failed  to choose date");
        validateLog(func.clickLanjut(wait), "Success click button Lanjut", "Failed to click button Lanjut");
        //validateLog(func.buttonClickInstagramLink(wait), "Navigated to Instagram", "Failed to navigate to instagram");
    //    validateLog(func.clickLanjut(wait), "Success directed to BCA url", "Failed to directed to Bca Url");
    }

    @Test(priority = 7, enabled = false)
    public void batalDesain() {
        test = extent.createTest("Test Batal Desain");
        validateLog(func.clickFb(wait), "Clicked Fb Icon", "Failed to click Fb");
        validateLog(moveTab(), "Moved to Main Tab", "Failed to Move Tab");
        validateLog(func.clickDesain(wait), "Clicked Mulai Desain", "Failed to Click Mulai Desain");
        validateLog(func.pilihGazelleHi(wait), "Clicked Gazelle Option Hi", "Failed to click Gazelle Option Hi");
        validateLog(func.gazelleHiCustomByIndex(wait, "3"), "Click custom part of the shoe index 3 from left", "Failed to select custom part of the shoe index 3 from left");
        validateLog(func.gazellePilihWarnaByIndexdanBagianCustom(wait, "3", "Eyestay"), "Click colour index 5 from left", "Failed to click colour index 5 from left");
        validateLog(func.confirmCustom(wait, "Eyestay"), "Click checklist ", "Failed to click checklist");
        validateLog(func.keluarDariCustom(wait), "Berhasil Batal Desain ", "Gagal Batal Desain");
        validateLog(func.pilihYa(wait), "Success Pilih Ya ", "Failed to click Ya");
       }

    @Test(priority = 3, enabled = false)
    public void test1() throws IOException {
        test = extent.createTest("Test Sosmed,Footer");
        validateLog(func.clickInstagram(wait), "Clicked Insta Icon", "Failed to click Insta");
        captureScreen("Ig");
        sleepBeforeAnotherExecutions(5000);
        moveTab();
        validateLog(func.clickFb(wait), "Clicked Fb Icon", "Failed to click Fb");
        captureScreen("Fb");
        sleepBeforeAnotherExecutions(5000);
    }

    @Test(priority = 4, enabled = false,description="ini test privacy")
    public void test2() throws IOException {
        test = extent.createTest("Test Privacy Policy,Terms and Conditions");
        validateLog(func.clickPrivacyPolicy(wait), "Success click Privacy Policy", "Failed to click Privacy Policy");
        captureScreen("Privacy");
        validateLog(func.close(wait), "Success close Privacy and Policy", "Failed to close Privacy and Policy");
        validateLog(func.clickTermsAndConditions(wait), "Success click Terms and Conditions", "Failed to click Terms and Conditions");
        captureScreen("TermAndConditions");
        validateLog(func.close(wait), "Success close Term And Conditions", "Failed to close TermAndConditions");

    }


    @Test(priority = 6, enabled = false,description="Ini Test Gazelle Low")
    public void kirimDesainDanSaveGambar() throws IOException {
        test = extent.createTest("Mulai Test Compass");
        validateLog(func.clickDesain(wait), "Clicked Mulai Desain", "Failed to Click Mulai Desain");
        validateLog(func.pilihGazelleLow(wait), "Clicked Gazelle Option Low", "Failed to click Gazelle Option Low");
        validateLog(func.gazelleHiCustomByIndex(wait, "3"), "Click custom part of the shoe index 3 from left", "Failed to select custom part of the shoe index 3 from left");
        validateLog(func.gazellePilihWarnaByIndexdanBagianCustom(wait, "4", "Eyestay"), "Click colour index 4 from left", "Failed to click colour index 4 from left");
        validateLog(func.confirmCustom(wait, "Eyestay"), "Click checklist ", "Failed to click checklist");
        validateLog(func.gazelleHiCustomByIndex(wait, "2"), "Click custom part of the shoe index 2 from left", "Failed to select custom part of the shoe index 2 from left");
        validateLog(func.gazellePilihWarnaByIndexdanBagianCustom(wait, "2", "Gazelle\\ Logo"), "Click colour index 2 from left", "Failed to click colour index 2 from left");
        validateLog(func.confirmCustom(wait, "Gazelle\\ Logo"), "Click checklist ", "Failed to click checklist");
        validateLog(func.gazelleHiCustom1(wait), "Click custom part of the shoe index 1 from left", "Failed to select custom part of the shoe index 1 from left");
        validateLog(func.gazellePilihWarnaByIndexdanBagianCustom(wait, "2", "Quarter"), "Click colour index 2 from left", "Failed to click colour index 2 from left");
        validateLog(func.confirmCustom(wait, "Quarter"), "Click checklist ", "Failed to click checklist");
        validateLog(func.kirimDesain(wait), "Click Kirim Desain Button", "Failed to click Kirim Desain Button");
        validateLog(func.confirmasiKirimDesain(wait), "Click ya to send design", "Failed to click ya");
        validateLog(func.isiData(wait, "fullName", "Ujang"), "Success to fill name in BioData", "Failed to fill Name");
        validateLog(func.isiData(wait, "email", "Ujang@gmail.com"), "Success to fill Email", "Failed to fill email");
        validateLog(func.isiData(wait, "phoneNumber", "08121212121"), "Success to fill Phone Number", "Failed to fill Phone Number");
        validateLog(func.clickCalenderIcon(wait), "Success click icon calendar", "Failed to click icon calendar");
        validateLog(func.pilihTanggal(wait, "6"), "Success to choose date", "Failed  to choose date");
        validateLog(func.clickLanjut(wait), "Success click button Lanjut", "Failed to click button Lanjut");
        validateLog(func.buttonSaveGambar(wait), "Popup Save gambar muncul", "Pop up save gambar tidak muncul");
        captureScreen("SaveGambarDesain");
        //validateLog(func.kembaliKeBeranda(wait),"Navigated to Beranda","Failed to Navigated to Beranda");

    }
   

    public Boolean moveTab() {
        try {
            ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
            //switch to new tab
            driver.switchTo().window(newTb.get(0));
            return true;
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
        if (condition == true) {
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
