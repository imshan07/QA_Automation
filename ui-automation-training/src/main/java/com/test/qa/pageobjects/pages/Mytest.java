package com.test.qa.pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mytest {
    public static void main (String[]agrs) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\QA\\ui-automation-training\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//*[@name=\"txtUsername\"]")).sendKeys("Admin");
       // Thread.sleep(1000);
        System.out.println("Enter the right UserName");

        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        //Thread.sleep(1000);
        System.out.println("Enter the right Password");

        driver.findElement(By.id("btnLogin")).click();
        //Thread.sleep(1000);
        System.out.println("Click Login Button");

        driver.findElement(By.xpath("//*[@href=\"/index.php/admin/viewAdminModule\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("menu_admin_UserManagement")).click();
        Thread.sleep(2000);
//        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("mshaann");
//
//        Select roles=new Select(driver.findElement(By.id("searchSystemUser_userType")));

//        roles.selectByVisibleText("ESS");
//        roles.selectByIndex(3);
        Thread.sleep(2000);
       driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
        driver.findElement(By.id("btnAdd")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("systemUser_userType")).sendKeys("ESS");
       driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Linda Anderson");
       System.out.println("Done Employee Neme ");

       driver.findElement(By.id("systemUser_userName")).sendKeys(("admin"));

//        Select roles=new Select(driver.findElement(By.id("systemUser_userType")));
//        roles.selectByVisibleText("ESS");
//        roles.selectByIndex(2);






//        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
//        Thread.sleep(2000);
//        System.out.println("Click welcome Button");
//
//        driver.findElement(By.xpath("//*[@href=\"/index.php/auth/logout\"]")).click();
//        Thread.sleep(2000);
//        System.out.println("Click Logout Button");

//        driver.findElement(By.name("txtUsername")).sendKeys("Ad2min");
//        Thread.sleep(1000);
//        System.out.println("Enter the Wrong UserName");
//
//        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//        Thread.sleep(1000);
//        System.out.println("Enter the right Password");
//
//        driver.findElement(By.id("btnLogin")).click();
//        Thread.sleep(1000);
//        System.out.println("Click Login Button");

    //    Thread.sleep(2000);

       // driver.close();
    }
}
