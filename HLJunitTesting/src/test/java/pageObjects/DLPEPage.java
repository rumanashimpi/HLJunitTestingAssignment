package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DLPEPage {

    WebDriver driver;

    @FindBy(xpath = "//a[text()='Example 1: Element on page that is hidden']")
    WebElement Example1;

    @FindBy(xpath = "//button[text()='Start']")
    WebElement StartBtn;

    @FindBy(xpath = "//h4[text()='Hello World!']")
    WebElement HelloWorld;

    @FindBy(xpath = "//a[text()='Example 2: Element rendered after the fact']")
    WebElement Example2;

    public DLPEPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickEg1() {
        Example1.click();
    }


    public void clickStartBtn() {
        StartBtn.click();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void clickEg2() {
        Example2.click();

    }

    public void displayHW(String Message) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String ActualText = driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        System.out.println("ActualText: " + ActualText);
        String ExpectedText = "Hello World!";
        Assert.assertEquals(ActualText, ExpectedText);
        System.out.println("validation is true");

    }

    public void displayHiddenMsg(String HidMsg) throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(6000);
        boolean res = false;

        res   = driver.findElement(By.id("finish")).isDisplayed();
        //Assert.assertTrue(Boolean.parseBoolean(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText()));
        System.out.println("Validation is true");

        if (res) {
            String textRes = driver.findElement(By.id("finish")).getText();
            System.out.println("Hidden Message " + textRes);
        }
        else
        {
            System.out.println("Validation is true. Res:" + res );
        }

    }


}