package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class JavaScriptAlert {
    ChromeDriver driver;
    @BeforeClass
    void setupDriver () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
    }
    @Test
    void getTitleFromPage() throws InterruptedException {
     //1
      /* driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
       Thread.sleep(1000);
        Alert alert  =driver.switchTo().alert();
        alert.accept();
*/
      //2
        /*  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();

        Alert alert  =driver.switchTo().alert();
       // driver.switchTo().alert().sendKeys("I am a JS prompt");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
*/

      //3
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();

        Alert alert  =driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("I am a JS prompt");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        }




    @AfterClass
    void closeDriver () {
        driver.close();
    }
}
