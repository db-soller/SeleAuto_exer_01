package com.facebook.tests;

import com.facebook.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTest extends BaseTest {

    @Test
    public void registerWithEmail(){
        //xpath absoluto
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));

        driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();

        //*fillout form*
        driver.findElement(By.name("firstname")).sendKeys("Diego");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Balbuena");

        //driver.findElement(By.name("lastname")).sendKeys("Balbuena Soller");

        driver.findElement(By.name("reg_email__")).sendKeys("dbs01@gmail.com");

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("dbs01@gmail.com");

        driver.findElement(By.id("password_step_input")).sendKeys("Password");

        //working with selected
        WebElement inputMonth = driver.findElement(By.id("month"));
        Select cbMonth = new Select(inputMonth);
        cbMonth.selectByIndex(0); // 0 = enero

        WebElement inputDay = driver.findElement(By.id("day"));
        Select cbDay = new Select(inputDay);
        cbDay.selectByValue("20"); // 20 = dia

        WebElement inputYear = driver.findElement(By.id("year"));
        Select cbYear = new Select(inputYear);
        cbYear.selectByVisibleText("2000"); // 2000 = año

        //usando el xpath relativo
        WebElement gender_content = driver.findElement(By.xpath("//span[@class='_5k_3']"));
        gender_content.findElement(By.xpath("//input[@value=1]")).click();

        //en una sola linea
        //driver.findElement(By.xpath("//span[@class='_5k_3']//input[@value=2]")).click();

        //tercera opcion
        //driver.findElement(By.xpath("//label[contains(text(),'Personalizado')]")).click();

        List<WebElement> labels = gender_content.findElements(By.tagName("label"));

        for (WebElement webElement : labels){
            System.out.println("the gender is: " + webElement.getText());
        }

        driver.findElement(By.linkText("Condiciones")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Registrarte')]")).submit();


    }

    /*@Test
    public void registerWithPhoneNumber(){
        driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();

        //*fillout form*
        driver.findElement(By.name("firstname")).sendKeys("Diego");

        driver.findElement(By.name("lastname")).sendKeys("Balbuena Soller");

        driver.findElement(By.name("reg_email__")).sendKeys("956840577");
    }*/

}
