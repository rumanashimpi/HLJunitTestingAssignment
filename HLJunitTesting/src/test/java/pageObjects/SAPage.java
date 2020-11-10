package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SAPage
{
    WebDriver driver;

    @FindBy(id = "flash")
    WebElement SAMsg;

@FindBy(xpath = "//a[@class='button secondary radius']")
WebElement LOBtn;



    public SAPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

/*public String getSAMsg()
{
        return SAMsg.getText();

}*/


    public void setConfirmationMsg(String message)
    {
        boolean validmessage = driver.findElement(By.id("flash")).isDisplayed();
        System.out.println("Confirmation Message: " + validmessage);}


public void clickLOBtn()
{
    LOBtn.click();
}

    public void displayErrMsg(String errMsg)
    {
        boolean errmessage = driver.findElement(By.id("flash")).isDisplayed();
        System.out.println("Error Message: " + errmessage);

    }



}
