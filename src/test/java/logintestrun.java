import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class logintestrun extends driverSetup {
//    public void logintestrun(WebDriver driver){
//            this.driver=driver;
//
//    }

    @Test(priority = 0)
    public void verifylogin() throws InterruptedException {
        logIn login = new logIn(driver);
        login.clickonProfileicon();
        login.signInclickonProfileicon();
        Thread.sleep(2000);
        login.emailIcon();
        System.out.println("successfully");
        Thread.sleep(2000);
        login.eMailid();
        login.password();
        login.submit();


    }


}
