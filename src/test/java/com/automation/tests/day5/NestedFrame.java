package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/nested_frames");
        BrowserUtils.wait(4);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        WebElement content = driver.findElement(By.id("content"));
        System.out.println(content.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");

        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println(body.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");

        WebElement body2 = driver.findElement(By.tagName("body"));
        System.out.println(body2.getText());

        driver.quit();
    }
}
