package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverFactory {

    private static WebDriver driver;
    private final static String DRIVER_PATH = "src/test/resources/";

    public static  WebDriver getDriver(Browser browser){
        File file;
        switch (browser){

            case CHROME:
                file = new File(DRIVER_PATH+"chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                break;
            case SAFARI:
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }
}
