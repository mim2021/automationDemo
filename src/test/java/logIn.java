import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logIn extends driverSetup {
    public logIn(WebDriver driver){
        this.driver=driver;
    }

    By profileicon = By.xpath("//div[@class='image flex-img d-flex align-items-center justify-content-center']");
    By signInbutton = By.xpath( "//li[contains(text(),'Sign In')]");

    By emailicon = By.xpath("//label[@id='loginEmail-label']");

    By emailidforlogin = By.xpath ("//body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]");
    By passwordforlogin = By.id ("loginPassword");
    By loginButton = By.xpath ("//button[@type='submit']");

    public void clickonProfileicon(){

        driver.findElement(profileicon).click();
    }

    public void signInclickonProfileicon(){
        driver.findElement(signInbutton).click();
    }

    public void emailIcon(){
        driver.findElement(emailicon).click();
    }
    public void eMailid(){
        driver.findElement(emailidforlogin).sendKeys("mim@sharetrip.net");
    }
    public void password(){
        driver.findElement(passwordforlogin).sendKeys("vugijugi");
    }
    public void submit(){
        driver.findElement(loginButton).click();
    }

}


