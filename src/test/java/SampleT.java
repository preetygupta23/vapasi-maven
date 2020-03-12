import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleT {
@Test
public void Sample() {
    System.setProperty("webdriver.chrome.driver", "/Users/nehapandey/downloads/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com");
    String s = driver.getTitle();
    System.out.println(s);
    Assert.assertEquals(driver.getTitle(), "Google");
}


}
