package com.aricent.SeleniumTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App
    {
        @Test

        public static void main(String[] args) {


            WebDriver driver = new FirefoxDriver();

            System.out.println("Selenium Web Driver Test");


                    driver.get("http://localhost:3001");

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(By.className("v-button")).click();
            driver.findElement(By.id("login")).sendKeys("edureka");
            driver.findElement(By.id("password")).sendKeys("edureka");
            driver.findElement(By.className("btn btn-primary")).click();
            //Thread.sleep(5000);
            System.out.println("Completed");
            driver.quit();
        }

    }

