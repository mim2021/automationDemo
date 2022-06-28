import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import java.time.Duration;

public class driverSetup {


    public WebDriver driver = null;

    @BeforeSuite
    public void driver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));


        driver.get("https://sharetrip.net/");
        driver.manage().window().maximize();

    }



    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();

    }
}