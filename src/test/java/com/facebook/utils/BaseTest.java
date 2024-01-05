package com.facebook.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
public class BaseTest {
    protected WebDriver driver;
    protected int TIME_OUT = 10;
    protected String BASE_URL = "https://www.facebook.com/";
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        driver.manage().window().maximize();
        driver.get(BASE_URL);

    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }


}
