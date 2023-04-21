package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownExample {
    ChromeDriver driver;
    @BeforeClass
    void setupDriver () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
    }
    @Test
    void getTitleFromPage() throws InterruptedException {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 2");
        Thread.sleep(1000);


        List<WebElement> list = select.getOptions();
        for(WebElement a:list){
            System.out.println(a.getText());
        }


    }

    @AfterClass
    void closeDriver () {
        driver.close();
    }

}
