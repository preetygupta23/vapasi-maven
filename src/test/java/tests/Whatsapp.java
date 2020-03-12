package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.helpers.AttributesImpl;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Whatsapp
{

    @Test
    public static void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "/Users/preetygupta/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class ='_3u328 copyable-text selectable-text']")).sendKeys("Vikas Airtel");
       // driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[@title='Vikas Airtel'][1]")).click();
        WebElement e = driver.findElement(By.xpath("//*[@class='_13mgZ']"));
       for (int i=0;i<=10;i++)
       {
           e.sendKeys("Happy Holi" + "\n");
       }

      //  driver.close();
    }
}

