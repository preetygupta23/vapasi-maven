package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver=null;

 @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/preetygupta/downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com");
    }

//    @AfterMethod
//    public void close() throws Exception {
//        driver.close();
//    }

}