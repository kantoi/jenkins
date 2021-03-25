
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.test.function.GlobalFunctionTestNg;
import java.util.ArrayList;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtentReportDemo2 {
    // Create global variable which will be used in all method

    ExtentReports extent;
    ExtentTest test;
    WebDriver driver = newWebDriverInitialization();
    WebDriverWait wait = waitTimeout();
    GlobalFunctionTestNg func = new GlobalFunctionTestNg();

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
    @BeforeMethod
    public void setup() {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("/Users/kentvanlim/Compass/ReportCompass.html");

        extent = new ExtentReports();

        extent.attachReporter(reporter);

    }

    //  Actual Test which will start the application and verify the title
    @Test(description = "Click Mulai Desain")
    public void getUrl() {
        test = extent.createTest("Mulai Test");
        System.setProperty("webdriver.gecko.driver", "/Users/kentvanlim/NetBeansProjects/compass/driver/geckodriver");
        driver.get("https://frontelease-colemanite-co31.antikode.dev");
        validateLog(driver.getTitle().equals("Home | Compass Xpresi"), "Berhasil", "Gagal");
    }

    @Test(description = "Click Mulai Desain")
    public void kirimDesain() {
        test = extent.createTest("Mulai Test Compass");
        validateLog(func.clickFb(wait),"Clicked Fb Icon","Failed to click Fb");
        validateLog(moveTab(),"Moved to Main Tab", "Failed to Move Tab");
        validateLog(func.clickDesain(wait), "Clicked Mulai Desain", "Failed to Click Mulai Desain");
        validateLog(func.pilihGazelleHi(wait),"Clicked Gazelle Option Hi", "Failed to click Gazelle Option Hi");
        validateLog(func.gazelleHiCustomByIndex(wait, "3"), "Click custom part of the shoe index 3 from left", "Failed to select custom part of the shoe index 3 from left");
        validateLog(func.gazellePilihWarnaByIndexdanBagianCustom(wait, "5", "Eyestay"),"Click colour index 5 from left", "Failed to click colour index 5 from left");
        validateLog(func.confirmCustom(wait, "Eyestay"), "Click checklist ", "Failed to click checklist");
        validateLog(func.kirimDesain(wait), "Click Kirim Desain Button", "Failed to click Kirim Desain Button");
        validateLog(func.confirmasiKirimDesain(wait), "Click ya to send design", "Failed to click ya");
        validateLog(func.isiData(wait, "fullName", "Ujang"), "Success to fill name in BioData", "Failed to fill Name");
        validateLog(func.isiData(wait, "email", "Ujang@gmail.com"),"Success to fill Email","Failed to fill email");
        validateLog(func.isiData(wait, "phoneNumber", "08121212121"),"Success to fill Phone Number","Failed to fill Phone Number");
        validateLog(func.clickCalenderIcon(wait),"Success click icon calendar","Failed to click icon calendar");
        validateLog(func.pilihTanggal(wait,"6"),"Success to choose date","Failed  to choose date");
        validateLog(func.clickLanjut(wait),"Success click button Lanjut","Failed to click button Lanjut");
        validateLog(func.buttonClickInstagramLink(wait),"Navigated to Instagram","Failed to navigate to instagram");
  
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
        }

    }

    // This will run after testcase and it will capture screenshot and add in report
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {

        extent.flush();
        //	driver.quit();

    }

}
