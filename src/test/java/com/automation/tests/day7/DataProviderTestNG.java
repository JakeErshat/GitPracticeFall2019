package com.automation.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

    @Test (description = "Verify page title", dataProvider = "testData")
    public void test1(String url, String title){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Assert.assertTrue(driver.getTitle().contains(title));
        driver.quit();
    }

    @DataProvider(name = "testData")
    public Object [][] testData(){
        return new Object[][] {{"http://google.com", "Google"},
                               {"http://amazon.com", "Amazon"},
                               {"http://etsy.com", "Etsy"},
                               {"http://ebay.com", "E"},
                               {"http://cybertekschool.com", "Cybertek"}};
    }

}
