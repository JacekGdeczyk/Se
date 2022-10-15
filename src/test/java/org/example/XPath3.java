package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.goodreads.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//a[normalize-space()='Sign up with email']")).click();
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Jacon Gdeczon");
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Test@test.pl");
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Jacon123!?");
        driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Jacon123!?");
        driver.findElement(By.xpath("//input[@id=   'continue']")).click();

        //driver.close();

    }
}
