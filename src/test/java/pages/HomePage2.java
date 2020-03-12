package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;


public class HomePage2 {

    WebDriver driver;
    By javaAlerts = By.linkText("JavaScript Alerts");
    By jsAlerts = By.xpath("//button[text()='Click for JS Alert']");
    By multipleWindows = By.linkText("Multiple Windows");
    By clickHere = By.linkText("Click Here");
    By newWindowText = By.xpath("//h3");

    public HomePage2 (WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickJavaAlerts()
    {
        driver.findElement(javaAlerts).click();
    }
     public void clickJsAlerts()
     {
         driver.findElement(jsAlerts).click();
     }
     public void clickMultipleWindows() throws InterruptedException {
         driver.findElement(multipleWindows).click();
         driver.findElement(clickHere).click();
         //driver.findElement(newWindowText).getText();

         Set<String> windows = driver.getWindowHandles();
         for(String i : windows)
         {
             System.out.println("Windows count is" + windows.size()) ;
         }
           for(String str : windows)
           {
               //String windowNumber =driver.switchTo().window(str).getWindowHandle();
               driver.switchTo().window(str);
               System.out.println("$$" + driver.findElement(newWindowText).getText());

           }
         Assert.assertEquals(driver.findElement(newWindowText).getText(),"New Window");

     }


}
