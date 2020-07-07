package com.automation.tests.day7;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXpath {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        //Absoloute Xpath
        WebElement dropDownLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
        System.out.println(dropDownLink.getText());

        //Relative Xpath
        WebElement headerText = driver.findElement(By.xpath("//span[@class=\"h1y\"]"));
        System.out.println(headerText.getText());

        WebElement contextMenu = driver.findElement(By.xpath("//a[.=\"Context Menu\"]"));
        System.out.println(contextMenu.getText());

        driver.quit();
    }
}
