package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Advanced_Collections {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goodreads.com/");
        List<WebElement> books = driver.findElements(By.cssSelector("img[src$='.jpg']"));

        System.out.println(books.size());
        for (WebElement book : books) {
            System.out.println(book.getAttribute("title"));
            System.out.println("-------");

        }

        driver.close();
    }
}
