package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Basics {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //System.out.println(driver.getCurrentUrl());

        //System.out.println(driver.getTitle());

        System.out.println(driver.getPageSource());

        //System.out.println(driver.getWindowHandle());
    }
}
