package pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage


{
    public static WebDriver driver;
public static WelcomePage welcomePage;
public static LoginPage loginPage;
public static SAPage saPage;
public static DLPEPage dlpePage;
public static JavaScriptAlertsPage javaScriptAlertsPage;

    @BeforeAll
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        welcomePage = new WelcomePage(driver);
        loginPage = new LoginPage(driver);
        saPage = new SAPage(driver);
        dlpePage = new DLPEPage(driver);
        javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
    }

    @AfterAll
    public void tearDown()
    {
        driver.quit();
    }


    public void pageRefresh()
    {
        driver.navigate().refresh();
    }

    public String getPageTitle()
    {
        return  driver.getTitle();
    }










}
