package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchtest {

    @Test
    public void googleTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://www.google.com/");
        driver.manage().window().maximize();


        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);

        Assert.assertEquals(driver.getTitle(), "Mobile - Google Search");


        driver.close();
    }
}
