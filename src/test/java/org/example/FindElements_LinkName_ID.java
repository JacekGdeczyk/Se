package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FindElements_LinkName_ID {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.actitime.com/");
        driver.findElement(By.linkText("Try Free")).click();
        driver.findElement(By.id(("First Name"))).sendKeys("Jacek");
        driver.findElement(By.id(("Last Name"))).sendKeys("Gdeczyk");
        driver.findElement(By.id(("Email"))).sendKeys("ja44@onet.eu");
        driver.findElement(By.id(("Company"))).sendKeys("Jacon");
        driver.findElement(By.linkText("Let's Go")).click();
        driver.findElement(By.className("verify-code__input-item")).sendKeys("000000");
        driver.close();


    }
}
