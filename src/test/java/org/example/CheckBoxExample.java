package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxExample {


    ChromeDriver driver;
    @BeforeClass
    void setupDriver () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }
    @Test

    void getTitleFromPage() throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,360)","");
        WebElement e= driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
        e.click();
        Thread.sleep(1000);

        WebElement a= driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
        a.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        Thread.sleep(1000);




    }

    @AfterClass
    void closeDriver () {
        driver.close();
    }

}