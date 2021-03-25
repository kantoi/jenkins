/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.function;

import java.time.Clock;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author kentvanlim
 */
public class GlobalFunction {

    public void clickDesain(FirefoxDriver drivers,WebDriverWait wait) {
        WebElement clickMulaiDesain = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Mulai Mendesain')]")));
        clickMulaiDesain.click();
        System.out.println("success clickMulai");
    }

    public void clickInstagram(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement seeInsta = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa-instagram")));
        sleepBeforeAnotherExecutions(5000);
        seeInsta.click();
        System.out.println("success clickIg");
    }

    public void clickFb(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement seeFb = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa-facebook-square")));
        sleepBeforeAnotherExecutions(5000);
        seeFb.click();
        System.out.println("success clickFb");
    }

    public void clickPrivacyPolicy(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement seeKebijakanPrivasi = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Kebijakan Privasi')]")));
        sleepBeforeAnotherExecutions(5000);
        seeKebijakanPrivasi.click();
        System.out.println("success click PrivacyPolicy");
       
    }

    public void clickTermsAndConditions(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement seeKebijakanPrivasi = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Syarat & Ketentuan')]")));
        sleepBeforeAnotherExecutions(5000);
        seeKebijakanPrivasi.click();
        System.out.println("success clickSyaratKetentuan");
        
    }
     public void caraIkut(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement caraIkut = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".scroll-hint > p")));
        sleepBeforeAnotherExecutions(5000);
        caraIkut.click();
        System.out.println("success clickCaraIkut");
      
    }
      public void keluarDariCustom(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement clickbuttonClose = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".custom-area .fal")));
        sleepBeforeAnotherExecutions(5000);
        clickbuttonClose.click();
        System.out.println("success clickCloseCustom");
      
    }
//     public void gazelleHiCustom2(FirefoxDriver drivers, WebDriverWait wait) {
//        WebElement style2 = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-slide:nth-child(2) .slider-option-container > .slider-img")));
//   
//        sleepBeforeAnotherExecutions(5000);
//        style2.click();
//        System.out.println("success liatHome");
//        
//    }
     public void gazelleHiCustomByIndex(FirefoxDriver drivers,WebDriverWait wait,String IndexCustom) {
        WebElement style3 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-slide:nth-child("+IndexCustom+") .slider-option-container > .slider-img")));
        sleepBeforeAnotherExecutions(5000);
        style3.click();
        System.out.println("success pilihStyle"+IndexCustom+"");
        
    }
       public void gazellePilihWarnaQuarter(FirefoxDriver drivers, WebDriverWait wait,String indexWarna) {
        WebElement style3 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Quarter .slick-slide:nth-child("+indexWarna+") .colour-option-body")));
        sleepBeforeAnotherExecutions(5000);
        style3.click();
        System.out.println("success gantiwarna");
        
    }
        public void gazellePilihWarnaGazelleLogo(FirefoxDriver drivers, WebDriverWait wait,String indexWarna) {
        WebElement style3 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Quarter .slick-slide:nth-child("+indexWarna+") .colour-option-body")));
        sleepBeforeAnotherExecutions(5000);
        style3.click();
        System.out.println("success gantiwarna");
        
    }
        public void gazellePilihWarnaByIndexdanBagianCustom(FirefoxDriver drivers, WebDriverWait wait,String indexWarna,String bagianCustom) {
        WebElement style3 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#"+bagianCustom+" .slick-slide:nth-child("+indexWarna+") .colour-option-body")));
        sleepBeforeAnotherExecutions(5000);
        style3.click();
        System.out.println("success gantiwarna");
        
    }
         public void gazellePilihWarnaEyeStay(FirefoxDriver drivers, WebDriverWait wait,String indexWarna) {
        WebElement style3 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#EyeStay .slick-slide:nth-child("+indexWarna+") .colour-option-body")));
        sleepBeforeAnotherExecutions(5000);
        style3.click();
        System.out.println("success gantiwarna");
        
    }
           public void gazellePilihWarnaBinding(FirefoxDriver drivers, WebDriverWait wait,String indexWarna) {
        WebElement style3 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Quarter .slick-slide:nth-child("+indexWarna+") .colour-option-body")));
        sleepBeforeAnotherExecutions(5000);
        style3.click();
        System.out.println("success gantiwarna");
        
    }
//     public void gazelleHiCustom4(FirefoxDriver drivers, WebDriverWait wait) {
//        WebElement style4 = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-slide:nth-child(4) .slider-option-container > .slider-img")));
//        sleepBeforeAnotherExecutions(5000);
//        style4.click();
//        System.out.println("success liatHome");
//      
//    }
     public void gazelleHiCustom1(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement style1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-current .slider-option-container > .slider-img")));
        sleepBeforeAnotherExecutions(5000);
        style1.click();
        System.out.println("success pilih style1");
   
    }
        public void confirmCustom(FirefoxDriver drivers, WebDriverWait wait,String bagianCustom) {
        WebElement style1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#"+bagianCustom+" .btn-primary")));
        sleepBeforeAnotherExecutions(5000);
        style1.click();
        System.out.println("success batal");
   
    }
        public void batalCustom(FirefoxDriver drivers, WebDriverWait wait,String bagianCustom) {
        WebElement style1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#"+bagianCustom+" .btn-outline-primary")));
        sleepBeforeAnotherExecutions(5000);
        style1.click();
        System.out.println("success confirm");
    }
        
        
        
        public void kirimDesain(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement style1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Kirim Desain')]")));
        sleepBeforeAnotherExecutions(5000);
        style1.click();
        System.out.println("success confirm");
   
    }
        
    public void moveTab(FirefoxDriver drivers) {
        ArrayList<String> newTb = new ArrayList<String>(drivers.getWindowHandles());
        //switch to new tab
        drivers.switchTo().window(newTb.get(0));
        System.out.println("pindah tab ke :" + drivers.getTitle());

    }

    public void close(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement seeFb = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa-times")));
        sleepBeforeAnotherExecutions(5000);
        seeFb.click();
        System.out.println("success close");
    }
    public void pilihYa(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Ya')]")));
   
        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        System.out.println("success clickIya");
       
    }
        public void pilihTidak(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Tidak')]")));
   
        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        System.out.println("success clickTidak");

    }
        
        public void confirmasiKirimDesain(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mw-sm:nth-child(2) .col-6:nth-child(2) > .btn")));
   
        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        System.out.println("success clickTidak");

    }
        
        public void batalKirimDesain(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".container > .row .btn-outline-primary")));
   
        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        System.out.println("success clickTidak");

    }
        public void isiData(FirefoxDriver drivers, WebDriverWait wait,String placeholder,String isiField) {
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(""+placeholder+"")));
   
        sleepBeforeAnotherExecutions(5000);
        clickYa.sendKeys(isiField);
        System.out.println("success clickTidak");

    }
        public void pilihGazelleHi(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement clickPilihGazzeleHi = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(3) .w-100")));
        sleepBeforeAnotherExecutions(5000);
        clickPilihGazzeleHi.click();
        System.out.println("success pilihGazzeleHi");
       
    }
        public void pilihGazelleLow(FirefoxDriver drivers, WebDriverWait wait) {
        WebElement clickPilihGazzeleLow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(2) .w-100")));
        sleepBeforeAnotherExecutions(5000);
        clickPilihGazzeleLow.click();
        System.out.println("success pilihGazzeleLow");
       
    }
    public static void sleepBeforeAnotherExecutions(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
