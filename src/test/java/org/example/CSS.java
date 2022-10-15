package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.findElement(By.cssSelector("i.hm-icon")).click();
        driver.findElement(By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[@class='hmenu hmenu-visible']/li[2]/a[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Amazon Music Unlimited']")).click();
        Thread.sleep(1000);
        String title = driver.findElement(By.cssSelector("span[id='a-autoid-0'] span[class='a-button-inner font_Amazon_Ember_Regular']")).getText();
        Thread.sleep(1000);
        System.out.println(title);
        if (title.contains("Try it free")) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        driver.close();
    }
}
