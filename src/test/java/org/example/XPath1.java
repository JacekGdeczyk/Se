package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.manage().window().maximize();
        driver.manage().getCookies();

        driver.findElement(By.xpath("//input[@placeholder='czego szukasz?']")).click();
    }

    }
