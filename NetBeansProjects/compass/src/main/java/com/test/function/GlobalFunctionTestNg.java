/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.function;

import java.time.Clock;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author kentvanlim
 */
public class GlobalFunctionTestNg {

    public Boolean getInfoCampaign(WebDriverWait wait) {
        try {
            WebElement clickMulaiDesain = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gatsby-focus-wrapper']/div/div[2]/div/div/h1/div/span")));
            String text = clickMulaiDesain.getText();
            System.out.println(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
      public Boolean clickDesain(WebDriverWait wait) {
        try {
            WebElement clickMulaiDesain = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Mulai Mendesain')]")));
            clickMulaiDesain.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    

    public Boolean clickInstagram(WebDriverWait wait) {
        try {
            WebElement seeInsta = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa-instagram")));
            sleepBeforeAnotherExecutions(5000);
            seeInsta.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean clickFb(WebDriverWait wait) {
        try {
            WebElement seeFb = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa-facebook-square")));
            sleepBeforeAnotherExecutions(5000);
            seeFb.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean clickPrivacyPolicy(WebDriverWait wait) {
        try {
            WebElement seeKebijakanPrivasi = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Kebijakan Privasi')]")));
            sleepBeforeAnotherExecutions(5000);
            seeKebijakanPrivasi.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean clickTermsAndConditions(WebDriverWait wait) {
        try {
            WebElement seeKebijakanPrivasi = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Syarat & Ketentuan')]")));
            sleepBeforeAnotherExecutions(5000);
            seeKebijakanPrivasi.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean caraIkut(WebDriverWait wait) {
        try {
            WebElement caraIkut = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".scroll-hint > p")));
            sleepBeforeAnotherExecutions(5000);
            caraIkut.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean keluarDariCustom(WebDriverWait wait) {
        try {
            WebElement clickbuttonClose = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".custom-area .fal")));
            sleepBeforeAnotherExecutions(5000);
            clickbuttonClose.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
     public Boolean clickBuatKartuBca(WebDriverWait wait) {
        try {
            WebElement clickbuttonClose = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.linkText("Buat Kartu BCA")));
            sleepBeforeAnotherExecutions(5000);
            clickbuttonClose.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//     public Boolean gazelleHiCustom2( WebDriverWait wait) {
//        WebElement style2 = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-slide:nth-child(2) .slider-option-container > .slider-img")));
//   
//        sleepBeforeAnotherExecutions(5000);
//        style2.click();
//        System.out.println("success liatHome");
//        
//    }

    public Boolean gazelleHiCustomByIndex(WebDriverWait wait, String IndexCustom) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-slide:nth-child(" + IndexCustom + ") .slider-option-container > .slider-img")));
            sleepBeforeAnotherExecutions(5000);
            style3.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean gazellePilihWarnaQuarter(WebDriverWait wait, String indexWarna) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Quarter .slick-slide:nth-child(" + indexWarna + ") .colour-option-body")));
            sleepBeforeAnotherExecutions(5000);
            style3.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean gazellePilihWarnaGazelleLogo(WebDriverWait wait, String indexWarna) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Quarter .slick-slide:nth-child(" + indexWarna + ") .colour-option-body")));
            sleepBeforeAnotherExecutions(5000);
            style3.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean gazellePilihWarnaByIndexdanBagianCustom(WebDriverWait wait, String indexWarna, String bagianCustom) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#" + bagianCustom + " .slick-slide:nth-child(" + indexWarna + ") .colour-option-body")));
            sleepBeforeAnotherExecutions(5000);
            style3.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    

    public Boolean gazellePilihWarnaEyeStay(WebDriverWait wait, String indexWarna) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#EyeStay .slick-slide:nth-child(" + indexWarna + ") .colour-option-body")));
            sleepBeforeAnotherExecutions(5000);
            style3.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean clickCalenderIcon(WebDriverWait wait) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".rdt > .form-control")));
            sleepBeforeAnotherExecutions(5000);
            style3.click(); 
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
    public Boolean pilihTanggal(WebDriverWait wait, String indexTanggal) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(":nth-child(2) > .rdtDay:nth-child("+indexTanggal+")")));
            sleepBeforeAnotherExecutions(5000);
            style3.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
     public Boolean clickLanjut(WebDriverWait wait) {
        try {
            WebElement style3 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary")));
            sleepBeforeAnotherExecutions(5000);
            style3.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
//     public Boolean gazelleHiCustom4( WebDriverWait wait) {
//        WebElement style4 = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-slide:nth-child(4) .slider-option-container > .slider-img")));
//        sleepBeforeAnotherExecutions(5000);
//        style4.click();
//        System.out.println("success liatHome");
//      
//    }

    public Boolean gazelleHiCustom1(WebDriverWait wait) {
        try {
            WebElement style1 = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".slick-current .slider-option-container > .slider-img")));
            sleepBeforeAnotherExecutions(5000);
            style1.click();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Boolean confirmCustom(WebDriverWait wait, String bagianCustom) {
        try{
        WebElement style1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#" + bagianCustom + " .btn-primary")));
        sleepBeforeAnotherExecutions(5000);
        style1.click();
        return true;
        }catch(Exception e){
            return false;
        }

    }

    public Boolean batalCustom(WebDriverWait wait, String bagianCustom) {
        try{
        WebElement style1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#" + bagianCustom + " .btn-outline-primary")));
        sleepBeforeAnotherExecutions(5000);
        style1.click();
        return true;
        }catch(Exception e){
            return false;
        }

    }

    public Boolean kirimDesain(WebDriverWait wait) {
        try{
        WebElement style1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Kirim Desain')]")));
        sleepBeforeAnotherExecutions(5000);
        style1.click();
        return true;
        }catch(Exception e){
            return false;
        }

    }


    public Boolean close(WebDriverWait wait) {
        try{
        WebElement seeFb = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa-times")));
        sleepBeforeAnotherExecutions(5000);
        seeFb.click();
        return true;
        }catch(Exception e){
            return false;
        }

    }

    public Boolean pilihYa(WebDriverWait wait) {
        try{
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Ya')]")));
        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        return true;
        }catch(Exception e){
            return false;
        }


    }

    public Boolean pilihTidak(WebDriverWait wait) {
        try{
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Tidak')]")));
        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        return true;
        }catch(Exception e){
            return false;
        }


    }

    public Boolean confirmasiKirimDesain(WebDriverWait wait) {
        try{
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mw-sm:nth-child(2) .col-6:nth-child(2) > .btn")));

        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        return true;
        }catch(Exception e){
            return false;
        }

    }

    public Boolean batalKirimDesain(WebDriverWait wait) {
        try{
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".container > .row .btn-outline-primary")));

        sleepBeforeAnotherExecutions(5000);
        clickYa.click();
        return true;
        }catch(Exception e){
            return false;
        }


    }

    public Boolean isiData(WebDriverWait wait, String placeholder, String isiField) {
        try{
        WebElement clickYa = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("" + placeholder + "")));

        sleepBeforeAnotherExecutions(5000);
        clickYa.sendKeys(isiField);
        return true;
        }catch(Exception e){
            return false;
        }


    }

    public Boolean pilihGazelleHi(WebDriverWait wait) {
        try{
        WebElement clickPilihGazzeleHi = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(2) .w-100")));
        sleepBeforeAnotherExecutions(5000);
        clickPilihGazzeleHi.click();
        return true;
        }catch(Exception e){
            return false;
        }


    }
      public Boolean kembaliKeBeranda(WebDriverWait wait) {
        try{
        WebElement clickBeranda = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("kembali ke beranda")));
        sleepBeforeAnotherExecutions(5000);
        clickBeranda.click();
        return true;
        }catch(Exception e){
            return false;
        }


    }

    public Boolean pilihGazelleHiTest(WebDriverWait wait) {
        try {
            WebElement clickPilihGazzeleHi = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(3) .w-100")));
            sleepBeforeAnotherExecutions(5000);
            clickPilihGazzeleHi.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean pilihGazelleLow(WebDriverWait wait) {
        try{
        WebElement clickPilihGazzeleLow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(3) .w-100")));
        sleepBeforeAnotherExecutions(5000);
        clickPilihGazzeleLow.click();
        return true;
        }catch(Exception e){
            return false;
        }


    }
    public Boolean buttonSaveGambar(WebDriverWait wait) {
        try{
        WebElement clickPilihGazzeleLow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn:nth-child(5)")));
        sleepBeforeAnotherExecutions(5000);
        clickPilihGazzeleLow.click();
        return true;
        }catch(Exception e){
            return false;
        }


    }
    
    public Boolean checkCaraIkutSerta(WebDriverWait wait) {
        try{
        WebElement clickPilihGazzeleLow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pb-main")));
        sleepBeforeAnotherExecutions(5000);
        clickPilihGazzeleLow.sendKeys("");
        sleepBeforeAnotherExecutions(5000);
        return true;
        }catch(Exception e){
            return false;
        }


    }
   
   
    public Boolean buttonClickInstagramLink(WebDriverWait wait) {
        try{
        WebElement clickPilihGazzeleLow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-instagram")));
        sleepBeforeAnotherExecutions(5000);
        clickPilihGazzeleLow.click();
        return true;
        }catch(Exception e){
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

}
