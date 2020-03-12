import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Test1

{

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {
        System.out.println("Inside BeforeTest ");

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
    @BeforeMethod
    public void method1 (){
        System.out.println("Inside method ");
    }
    @BeforeClass
    public void method2 () {
        System.out.println("Inside class");
    }

    @Test
    public void method3 (){
        System.out.println("Inside Test");
    }
}
