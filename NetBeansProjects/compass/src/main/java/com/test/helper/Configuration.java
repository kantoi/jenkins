/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.helper;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import java.io.File;

/**
 *
 * @author kentvanlim
 */
public class Configuration {
   
    //webdriver configs
    public static Config getWebDriverConfig()
    {
        return ConfigFactory.parseFile(new File("conf/web-driver.conf"));
    }
    

}
