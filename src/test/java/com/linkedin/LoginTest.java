package com.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    protected WebDriver driver;
    protected int TIME_OUT = 10; //segundo
    //WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        //asigna un tiempo de espera para ubicar el primer webelement
        driver.get("https://www.linkedin.com/");

    }

    @Test
    public void doLogin(){
        //identifico en email y escribo
        driver.findElement(By.id("session_key")).sendKeys("diegobalbuenasoller@gmail.com");
        //obtengo un webelement del password
        WebElement inputPass = driver.findElement(By.name("session_password"));
        //limpiar el webelement en caso tenga informacion
        inputPass.clear();
        //escribir el password en el input
        inputPass.sendKeys("12345");
        //click submit, uso el submit porque existe un formulario
        //driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).submit();
        driver.findElement(By.xpath("//button[contains(text(),'Inicia sesión')]")).submit();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
