package com.demo_web_shop_tests.firstSeleniumProjectHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TableTestsHM14 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementByXpath(){
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));

        driver.findElement(By.xpath("//*[@id='ui-id-1']"));

        driver.findElement(By.xpath("//div[@class='bar-notification']"));

        driver.findElement(By.xpath("//li[contains(.,'Cards')]"));

        driver.findElement(By.xpath("//strong[.='Newsletter']"));

        driver.findElement(By.xpath("//a[@class='ico-register']/.."));

        driver.findElement(By.xpath("//span[@class='cart-label']/.."));

        driver.findElement(By.xpath("//strong/parent::*"));

        driver.findElement(By.xpath("//strong/ancestor::div"));

        driver.findElement(By.xpath("//strong/following-sibling::div"));
    }
}
