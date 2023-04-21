package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class AppTest {
    ChromeDriver driver;
    @BeforeClass
    void setupDriver () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
    } @Test()
    void Webdriverdropdownlogin() throws InterruptedException {
        Thread.sleep(19000);


        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
        dropdown.selectByVisibleText("SQL");

        Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));

        dropdown1.selectByVisibleText("JUnit");
        Thread.sleep(1000);
        Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
        dropdown2.selectByVisibleText("JQuery");
        Thread.sleep(100);


        WebElement checkbox1 = driver.findElement(By.cssSelector("input[value='option-1']"));
        checkbox1.click();
        Thread.sleep(1000);
        WebElement checkbox3 = driver.findElement(By.cssSelector("input[value='option-3']"));
        checkbox3.click();
        Thread.sleep(1000);

        WebElement checkbox4 = driver.findElement(By.cssSelector("input[value='option-4']"));
        checkbox4.click();
        Thread.sleep(1000);


        WebElement radioButton = driver.findElement(By.cssSelector("input[value='purple']"));
        radioButton.click();
        Thread.sleep(1000);


    }

    @AfterClass
    void closeDriver () {
        driver.close();
    }

}