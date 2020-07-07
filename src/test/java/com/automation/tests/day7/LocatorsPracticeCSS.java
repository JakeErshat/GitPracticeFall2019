package com.automation.tests.day7;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsPracticeCSS {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("email@cybertekschool.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("777-777-7777");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("supersdet");
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("10/10/1990");
        driver.findElement(By.cssSelector("input[value='male']")).click();
        Select select = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        select.selectByVisibleText("SDET");
        driver.findElement(By.id("wooden_spoon")).click();


        BrowserUtils.wait(3);
        driver.quit();
    }
}
