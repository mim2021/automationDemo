import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class logintestrun extends driverSetup {


    SoftAssert softAssert = new SoftAssert();


    @Test(priority = 0)
    public void verifylogin() throws InterruptedException {
        logIn login = new logIn(driver);
        login.clickonProfileicon();
        softAssert.assertEquals(true,true);
        login.signInclickonProfileicon();
        softAssert.assertEquals(true,true);
        System.out.println("successfully clicked");
        Thread.sleep(1000);
        softAssert.assertAll();

    }
    @Test(priority = 1)
    public void loginrun() throws InterruptedException {
        logIn logrun = new logIn(driver);
        logrun.eMailid();
        softAssert.assertEquals(true,true);
        logrun.password();
        softAssert.assertEquals(true,true);
        logrun.submit();
        softAssert.assertEquals(true,true);
        System.out.println("successfully login");
        Thread.sleep(1000);
        softAssert.assertAll();




    }

}
