package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElements_Name {

    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.amazon.com");

        driver.findElement(By.name("field-keywords")).sendKeys("Barbie Dalls");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("Baby Doctor")).click();
        Thread.sleep(2000);

        String productTitle = driver.findElement(By.id("productTitle")).getText();
        String productPrice = driver.findElement(By.className("a-price-whole")).getText();
        String currency = driver.findElement(By.className("a-price-symbol")).getText();

        System.out.println("productTitle " + productTitle);
        System.out.println("productPrice " + currency + productPrice);
        
    }
}
