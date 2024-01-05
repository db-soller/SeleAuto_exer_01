package com.magento.tests;

import com.magento.utils.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test (priority = 1)
    public void registerWithEmail(){

        driver.findElement(By.xpath("//a[contains(text(),'Create an Account')]")).click();

        driver.findElement(By.name("firstname")).sendKeys("Diego");

        driver.findElement(By.name("lastname")).sendKeys("Balbuena");

        driver.findElement(By.name("email")).sendKeys("dbs002@gmail.com");

        driver.findElement(By.name("password")).sendKeys("db01.MELL@_");

        driver.findElement(By.name("password_confirmation")).sendKeys("db01.MELL@_");

        driver.findElement(By.xpath("//span[contains(text(), 'Create an Account')]")).submit();
    }

    @Test (priority = 3)
    public void loginWithEmailCorrect(){

        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

        driver.findElement(By.name("login[username]")).sendKeys("dbs002@gmail.com");

        driver.findElement(By.name("login[password]")).sendKeys("db01.MELL@_");

        driver.findElement(By.name("send")).submit();
    }


    @Test (priority = 2)
    public void loginWithEmailInCorrect(){

        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

        driver.findElement(By.name("login[username]")).sendKeys("dbs001x@gmail.com");

        driver.findElement(By.name("login[password]")).sendKeys("db00.MELL@_");

        driver.findElement(By.name("send")).submit();


    }
}
