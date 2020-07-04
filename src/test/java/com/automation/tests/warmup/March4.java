package com.automation.tests.warmup;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class March4 {
    static WebDriver driver;

    public static void main(String[] args) throws Exception{
        ebayTest();
        amazonTest();
        wikiTest();
    }

    public static void ebayTest() throws Exception{
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(2000);
        WebElement searchResults = driver.findElement(By.tagName("h1"));
        System.out.println(searchResults.getText().split(" ")[0]);
        driver.quit();
    }

    public static void amazonTest() throws Exception {
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
        Thread.sleep(2000);
        String title = driver.getTitle();
        if (title.contains("java book")){
            System.out.println("TEST PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }

        driver.quit();
    }

    public static void wikiTest() throws Exception {
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium (software)", Keys.ENTER);
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        if(url.endsWith("Selenium_(software)")){
            System.out.println("TEST PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }
        driver.quit();
    }
}
