package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodReads {
    public static void main(String[] args) {
        /*
        'and'
        //Tagname[@Att1='Value1' and @Att2='Value2']
        //Tagname[@Att='Value' AND Text()='Value']

        'or'
        //Tagname[@Att1='Value1' OR @Att2='Value2']
        //Tagname[@Att='Value' OR Text()='Value']

        'contains'
        //Tagname[contains(@Att,'Partial Value')]
        //Tagname[contains(text() ,'Partial Value')]

        'starts-with'
        //Tagname[starts-with(@Att,'Starting Value')]
        //Tagname[starts-with(text() ,'Starting Value')]

        Hybrid
        //Tagname[contains(@Att1,'Partial Value') and starts-with(text() ,'Starting Value')]
        //Tagname[@Att1='Value' or starts-with(@Att2,'Starting Value')]
        //*[@Att='Value']

         */
        System.setProperty("webdriver.chrome.driver", "C://Users/hp1/.jdks/openjdk-18.0.2.1/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://brewiarz.pl");
        driver.findElement(By.xpath("(//input[@value='Przejdź ->'])[1]")).click();

        driver.close();
    }
}
