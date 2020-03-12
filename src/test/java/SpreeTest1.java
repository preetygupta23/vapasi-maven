import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpreeTest1 {
@Test
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "/Users/nehapandey/downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://spree-vapasi.herokuapp.com/");
        String Title = driver.getTitle();
        System.out.println(Title);

    Assert.assertEquals(driver.getTitle(), "Spree Demo Site");

      driver.findElement(By.linkText("Bags")).click();
      String Bags = driver.findElement(By.className("taxon-title")).getText();
      Assert.assertEquals(Bags, "Bags");
      WebElement link = driver.findElement(By.linkText("Ruby on Rails Bag"));
      link.click();
      //driver.findElement(By.xpath("//*[@href=\"/products/ruby-on-rails-bag?taxon_id=3\"]")).click();

    }

}
