package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElements_Collection {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actitime.com/");
        List<WebElement> links = driver.findElements(By.cssSelector("a.main-menu_link"));
        for (WebElement link : links) {
            String text = link.getText();
            if (!text.trim().isEmpty()) {
}
            System.out.println(link.getText());
            System.out.println(link.getAttribute("class"));
            System.out.println("-----------");

        }
    driver.close();
    }
}
