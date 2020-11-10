import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

public class BaseTest
{

    public static WebDriver driver;
    public static WelcomePage welcomePage;
    public static LoginPage loginPage;
    public static SAPage saPage;
    public static DLPEPage dlpePage;
    public static JavaScriptAlertsPage javaScriptAlertsPage;

    @Before
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

    @After
    public void tearDown(Scenario scenario)
    {
        driver.quit();
    }

    public void pageRefresh()
    {
        driver.navigate().refresh();
    }

    public static String getPageTitle()
    {
        return  driver.getTitle();
    }

}
