package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base{
    HomePage obj ;
    LoginPage objlogin ;

    @Test
      public void verifylogin()
    {
        HomePage obj = new HomePage(driver);
        LoginPage objlogin = new LoginPage(driver);
      obj.clickLoginButton();

      objlogin.setUsername();
      objlogin.setPswd();
      objlogin.clickLoginbtt();


     }



}
