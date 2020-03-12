package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
          WebDriver driver;
          public LoginPage(WebDriver driver)
          {
              this.driver = driver;
          }

          By username = By.id("spree_user_email");
          By pswd = By.id("spree_user_password");
          By loginButton = By.name("commit");

          public void setUsername()
          {
              driver.findElement(username).sendKeys("spree@example.com");
          }
    public void setPswd()
    {
        driver.findElement(pswd).sendKeys("spree123");
    }
     public void clickLoginbtt()
     {
         driver.findElement(loginButton).click();
     }
}
