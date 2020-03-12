package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage2;

public class AlertTest extends Base{

    HomePage2 obj;

//     @Test
//    public void clickJavaScript()
//     {
//
//         obj.clickJavaAlerts();
//     }
//
//   public void clickJsAlerts()
//   {
//
//      obj.clickJsAlerts();
//
//   }
//    public void alertaccept()
//    {
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//    }


 @Test

    public void clickmultipleWindows()
    {
        HomePage2 obj = new HomePage2(driver);
        try {
            obj.clickMultipleWindows();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
//    public void clickOnClickHere()
//    {
//        HomePage2 obj = new HomePage2(driver);
//        try {
//            obj.clickMultipleWindows();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }


}
