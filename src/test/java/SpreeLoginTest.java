import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.text.html.Option;
import java.util.concurrent.TimeUnit;

public class SpreeLoginTest {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("I am firefox");
            System.setProperty("webdriver.gecko.driver" ,  "/Users/nehapandey/downloads/geckodriver");
            driver = new FirefoxDriver();
            driver.get("https://spree-vapasi.herokuapp.com/");
        }
        else
        {
            System.out.println("I am chrome");
            System.setProperty("webdriver.chrome.driver" ,  "/Users/nehapandey/downloads/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://spree-vapasi.herokuapp.com/");
        }
    }


//    @BeforeTest
//    public void setUp1(){
//        System.setProperty("webdriver.chrome.driver", "/Users/nehapandey/downloads/chromedriver");
//         driver = new ChromeDriver();
//        driver.get("https://spree-vapasi.herokuapp.com/");
//        driver.manage().window().maximize();
//
//    }

    @Test
    public void login () throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "/Users/nehapandey/downloads/chromedriver");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://spree-vapasi.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"link-to-login\"]")).click();
        driver.findElement(By.name("spree_user[email]")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();
        WebElement dropdown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Brands");

    }

      @Test
      public void rightClick() {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          Actions action = new Actions(driver);
       WebElement rightclick =  driver.findElement(By.linkText("Mugs"));

          action.contextClick(rightclick).perform();



    }
//     @Test
    public void selectRightClickOption(){
    WebElement ele= driver.findElement(By.linkText("Open Link in New Window"));
    Select select = new Select(ele);
    select.selectByVisibleText("Open Link in New Window");

    }
}
