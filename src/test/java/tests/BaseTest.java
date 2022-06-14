package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import steps.LoginPageSteps;
import utils.Browser;
import utils.DriverFactory;
import utils.PropertyReader;

import java.io.File;
import java.util.List;

public abstract class BaseTest {

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver driver;
    LoginPageSteps steps;

    @BeforeMethod
    public void openHomePage(){
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        driver.get(PropertyReader.getUrl());
        steps = new LoginPageSteps();
    }

    @AfterMethod
    public void tearDown(){
        // Закрываем браузер
        driver.quit();
    }
    @DataProvider(name = "dataProvider")
     public Object[][]dataProviderMethod() {
        return new Object[][]{{"akozykin@alytics-team.com"}, {"nglazova@alytics-team.com"}};
     }



}
