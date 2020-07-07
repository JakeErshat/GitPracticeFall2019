package com.automation.tests.day7;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("Before method");
    }

    @Test (priority = 3)
    public void test1() {
        String str1 = "java";
        String str2 = "java";
        System.out.println("Test1");
        Assert.assertEquals(str1,str2);
    }

    @Test (priority = 2)
    public void test2() {
        String str1 = "javascript";
        String str2 = "javascript";
        System.out.println("Test2");
        Assert.assertEquals(str1,str2);
    }

    @Test (priority = 1)
    public void test3() {
        System.out.println("Test3");
        Assert.assertTrue(15 > 10);
        throw new SkipException("Just skipped");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }
}
