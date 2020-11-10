package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class JavaScriptAlertsPage

{
    WebDriver driver;

@FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement JSConfirm;

@FindBy(xpath = "//h3[text()='JavaScript Alerts']")
WebElement JavaScriptsAltPage;

@FindBy(xpath = "//button[text()='Click for JS Alert']")
WebElement JSAlert;

@FindBy(xpath = "//button[text()='Click for JS Prompt']")
WebElement JSPrompt;

    public JavaScriptAlertsPage(WebDriver driver)
    {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

public void clickJsCfn() throws InterruptedException {
    JSConfirm.click();
    Thread.sleep(3000);
    driver.switchTo().alert().accept(); //OK Button to accept
}

    public void JScCancel() throws InterruptedException {
        JSConfirm.click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss(); //Cancel button

    }
public boolean displayJSAPage() {


return JavaScriptsAltPage.isDisplayed();
}

public void JSCMsg(String jscMsg) throws InterruptedException {

   // driver.switchTo().alert().accept(); //OK Button to accept
    Thread.sleep(500);
    String JSconfmMsg = driver.findElement(By.id("result")).getText();
    System.out.println("JavaScript Confirm Message displayed: " + JSconfmMsg);

}

public void clickJSAlert() throws InterruptedException {

        JSAlert.click();
        Thread.sleep(3000);
    driver.switchTo().alert().accept(); //OK Button to accept

}

public void JSPromptOKBtn(String textMsg) throws InterruptedException {
        JSPrompt.click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("I am JS Prompt");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();


}


}
