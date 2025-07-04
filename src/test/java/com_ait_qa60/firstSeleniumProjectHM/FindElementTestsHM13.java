package com.demo_web_shop_tests.firstSeleniumProjectHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementTestsHM13 {

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
    public void findElementByTagName(){

        WebElement element = driver.findElement(By.tagName("a"));
        System.out.println(element.getText());
    }
    @Test
    public void findElementBySimpleLocators(){
        driver.findElement(By.id("mob-menu-button"));
        driver.findElement(By.id("dialog-notifications-success"));
        driver.findElement(By.id("bar-notification"));

        driver.findElement(By.className("master-wrapper-page"));
        driver.findElement(By.className("header"));
        driver.findElement(By.className("search-box"));

        driver.findElement(By.linkText("Register"));
        driver.findElement(By.linkText("Log in"));
        driver.findElement(By.linkText("Shopping cart"));

        driver.findElement(By.partialLinkText("Shopping"));
        driver.findElement(By.partialLinkText("cart"));
        driver.findElement(By.partialLinkText("Log"));
    }
    @Test
    public void findByCssSelectorTest(){
        driver.findElement(By.cssSelector("a"));
        driver.findElement(By.cssSelector("li"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".header-links-wrapper"));
        driver.findElement(By.cssSelector("[href='/login']"));
        driver.findElement(By.cssSelector("[href='/cart']"));
        driver.findElement(By.cssSelector("[href*='/apparel']"));
        driver.findElement(By.cssSelector("[href^='/log']"));
        driver.findElement(By.cssSelector("[href$='/shoes']"));
    }
}
