package com.cj.CJWholesale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
     
    	@Test
    	public void test1() throws Exception{
        System.out.println( "Hello World!" ); 
    	
       		System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe");
    				
    		 WebDriver driver = new ChromeDriver();
    				driver.manage().window().maximize();				
    				driver.get("https://www.facebook.com/");    				
    				driver.close();
    				
    				}
    }

    

