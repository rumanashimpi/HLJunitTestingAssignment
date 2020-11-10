package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage

{
    WebDriver driver;

    @FindBy(id = "username")
    WebElement UN;

@FindBy(id = "password")
WebElement PW;

@FindBy(xpath = "//i[text()=' Login']")
WebElement LoginBtn;

@FindBy(id = "flash")
WebElement ErrorMsg;





    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUN(String un)
    {
        UN.sendKeys(un);
    }

    public void enterPW(String pw)
    {
        PW.sendKeys(pw);

    }


public void clickLoginBtn() throws InterruptedException {
        LoginBtn.click();
        Thread.sleep(2000);

}



}
