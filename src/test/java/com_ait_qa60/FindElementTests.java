package com_ait_qa60;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementByTagName(){

        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }
    @Test
    public void findElementBySimpleLocators(){
        driver.findElement(By.id("city"));

        driver.findElement(By.className("header"));

        driver.findElement(By.linkText("Let the car work"));

        driver.findElement(By.partialLinkText("car"));
    }
    @Test
    public void findByCssSelectorTest(){
        driver.findElement(By.cssSelector("h1"));

        driver.findElement(By.cssSelector("#city"));

        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));

        driver.findElement(By.cssSelector("[href*='login']"));

        driver.findElement(By.cssSelector("[href^='/log']"));

        driver.findElement(By.cssSelector("[href$='search']"));

        driver.findElement(By.cssSelector("input#city"));

        driver.findElement(By.cssSelector("div.search-card"));

        driver.findElement(By.cssSelector("input#city[type='text']"));
    }
    @Test
    public void findElementByXpath(){
        driver.findElement(By.xpath("//h1"));

        //driver.findElement(By.xpath("//input[@id='city']"));
        // or
        driver.findElement(By.xpath("//*[@id='city']"));

        driver.findElement(By.xpath("//div[@class='header']"));

        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));

        //driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));

        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));

        driver.findElement(By.xpath("//a[@class='navigation-link']/.."));

        driver.findElement(By.xpath("//h1/parent::*"));
        driver.findElement(By.xpath("//h1/parent::div"));
        driver.findElement(By.xpath("//h1/.."));

        driver.findElement(By.xpath("//h1/ancestor::*")); // all
        driver.findElement(By.xpath("//h1/ancestor::div")); // 2 options
        driver.findElement(By.xpath("//h1/ancestor::div[2]")); // 1 option
        driver.findElement(By.xpath("//h1/following-sibling::form"));
        driver.findElement(By.xpath("//h2/preceding-sibling::*"));
    }
}
