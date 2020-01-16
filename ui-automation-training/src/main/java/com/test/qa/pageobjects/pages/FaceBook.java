package com.test.qa.pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook  {
    public static void main (String[]agrs){
        System.setProperty("webdriver.chrome.driver","D:\\QA\\ui-automation-training\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Tharani");
        driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Sriprahasam");
        driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("0770327335");
        driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();



    }
}
