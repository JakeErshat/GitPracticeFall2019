package com.automation.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClassPractice {

    @Test
    public void dragAndDropTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement dropTarget = driver.findElement(By.id("droptarget"));
        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        actions.dragAndDrop(draggable, dropTarget).perform();
        Thread.sleep(2000);

        Assert.assertEquals(dropTarget.getText(), "You did great!");

        driver.quit();
    }

    @Test
    public void hoverTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/hovers");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
        WebElement img1Text = driver.findElement(By.xpath("//*[text()='name: user1']"));

        actions.moveToElement(img1).perform();

        Assert.assertTrue(img1Text.isDisplayed());

        driver.quit();
    }
}
