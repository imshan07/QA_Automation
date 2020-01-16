package com.test.qa.pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main (String[]agrs) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\QA\\ui-automation-training\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//*[@name=\"txtUsername\"]")).sendKeys("Admin");
        Thread.sleep(1000);
        System.out.println("Enter the right UserName");

        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        Thread.sleep(1000);
        System.out.println("Enter the right Password");

       driver.findElement(By.id("btnLogin")).click();
       Thread.sleep(1000);
        System.out.println("Click Login Button");

       driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        Thread.sleep(2000);
        System.out.println("Click welcome Button");

       driver.findElement(By.xpath("//*[@href=\"/index.php/auth/logout\"]")).click();
        Thread.sleep(2000);
        System.out.println("Click Logout Button");

        driver.findElement(By.name("txtUsername")).sendKeys("Ad2min");
        Thread.sleep(1000);
        System.out.println("Enter the Wrong UserName");

        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        Thread.sleep(1000);
        System.out.println("Enter the right Password");

        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(1000);
        System.out.println("Click Login Button");

        Thread.sleep(2000);

        driver.close();
    }
}
