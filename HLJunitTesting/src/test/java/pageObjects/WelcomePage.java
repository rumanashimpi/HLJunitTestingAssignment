package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
    WebDriver driver;

//Locators

@FindBy(xpath = "//a[text()='Form Authentication']")
    WebElement FALink;


@FindBy(xpath = "//a[text()='Dynamic Loading']")
WebElement DynamicLoading;

@FindBy(xpath = "//a[text()='JavaScript Alerts']")
WebElement javaScriptAlerts;

    public WelcomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

public void navigateToUrl(String ul)
{

        driver.navigate().to(ul);
}


public void clickFALink()
{
        FALink.click();

}
public void clickDL()
{
    DynamicLoading.click();

}

public void clickJSA()
{
        javaScriptAlerts.click();

}

}
