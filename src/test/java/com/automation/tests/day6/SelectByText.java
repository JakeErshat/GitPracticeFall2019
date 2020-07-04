package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByText {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);

        WebElement simpleDropDown = driver.findElement(By.id("dropdown"));

        Select selectSimpleDropDown = new Select(simpleDropDown);
        selectSimpleDropDown.selectByVisibleText("Option 2");
        BrowserUtils.wait(3);
        selectSimpleDropDown.selectByVisibleText("Option 1");
        BrowserUtils.wait(3);

        Select selectYear = new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));

        selectYear.selectByVisibleText("2003");
        selectMonth.selectByVisibleText("February");
        selectDay.selectByVisibleText("1");

        List<WebElement> months = selectMonth.getOptions();
        for (WebElement month: months){
            selectMonth.selectByVisibleText(month.getText());
            BrowserUtils.wait(1);
        }

        BrowserUtils.wait(3);

        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("District Of Columbia");

        BrowserUtils.wait(3);
        driver.quit();
    }
}
