package com.demo_web_shop_tests.firstSeleniumProjectHM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumProjectHM12 {

    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @Test
    public void openIlcaroTest(){
        System.out.println("Open");
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
    driver.quit();
    }
}
