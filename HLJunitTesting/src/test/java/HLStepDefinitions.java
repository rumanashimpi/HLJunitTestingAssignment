import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pageObjects.BasePage;

public class HLStepDefinitions
{
    //Form Authentication

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url) {

       BaseTest.welcomePage.navigateToUrl(url);
    }

    @Then("I should be navigated to Welcome page")
    public void i_should_be_navigated_to_Welcome_page() {

        String TitleActual = BaseTest.getPageTitle();
        System.out.println("ActualTitle: " + TitleActual);
        String TitleExpected = "The Internet";
        Assert.assertEquals(TitleActual,TitleExpected);
        System.out.println("validation is true");

    }

    @When("I click on Form Authentication link")
    public void i_click_on_Form_Authentication_link() {
        BaseTest.welcomePage.clickFALink();
    }

    @Then("I should be navigated to login page")
    public void i_should_be_navigated_to_login_page() {
        System.out.println("Login page title is displayed" + BaseTest.getPageTitle());
    }

    @When("I enter Username as {string}")
    public void i_enter_Username_as(String un) {
        BaseTest.loginPage.enterUN(un);
    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String pw) {
        BaseTest.loginPage.enterPW(pw);
    }

    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        BaseTest.loginPage.clickLoginBtn();
    }


    @When("I click Logout")
    public void i_click_Logout()
    {
        BaseTest.saPage.clickLOBtn();
    }

    @Then("Verify I log out successfully")
    public void verify_I_log_out_successfully()
    {
        System.out.println("Login page is displayed: " + BaseTest.getPageTitle());
    }


    @Then("Verify I should see the Message {string}")
    public void verifyIShouldSeeTheMessage(String message) throws Throwable {


        BaseTest.saPage.setConfirmationMsg(message);

    }

//Invalid Username error message
    @Then("Verify I should see the error Message {string}")
    public void verifyIShouldSeeTheErrorMessage(String errMsg)
    {
        BaseTest.saPage.displayErrMsg(errMsg);
    }

//DynamicLoading

    @When("I click Dynamic Loading link")
    public void i_click_Dynamic_Loading_link()
    {BaseTest.welcomePage.clickDL();

    }

    @Then("I should be navigated to Dynamically Loaded page Elements")
    public void i_should_be_navigated_to_Dynamically_Loaded_page_Elements()
    {
        System.out.println("Page title displayed: " + BaseTest.getPageTitle());

    }

    @When("I click Example {int} link")
    public void i_click_Example_link(Integer int1)
    {
        BaseTest.dlpePage.clickEg2();

    }

    @When("I click Start button")
    public void i_click_Start_button()
    {
        BaseTest.dlpePage.clickStartBtn();
    }

    @Then("I verify that {string} Message is displayed")
    public void i_verify_that_Message_is_displayed(String Message)
    {
        BaseTest.dlpePage.displayHW(Message);
        }



    @When("I click Example{int} link")
    public void iClickExampleLink(int arg0)
    {
        BaseTest.dlpePage.clickEg1();
    }


        //JavaScript Alerts


    @When("I click JavaScriptAlerts")
    public void i_click_JavaScriptAlerts()
    {
        BaseTest.welcomePage.clickJSA();
    }

    @Then("I navigate to JavaSriptAlerts page")
    public void i_navigate_to_JavaSriptAlerts_page()
    {
       System.out.println("JavaScript Alerts Page is displayed: " + BaseTest.getPageTitle());


    }



    @When("I click JS Confirm and click OK")
    public void iClickJSConfirmAndClickOK() throws InterruptedException {
        BaseTest.javaScriptAlertsPage.clickJsCfn();
    }



    @Then("Verify the result {string}")
    public void verifyTheResult(String jscMsg) throws InterruptedException {
        BaseTest.javaScriptAlertsPage.JSCMsg(jscMsg);
    }

//JS Confirm Cancel

    @When("I click JS Confirm and click cancel")
    public void iClickJSConfirmAndClickCancel() throws InterruptedException {
        BaseTest.javaScriptAlertsPage.JScCancel();
    }

    // JS Alert OK

    @When("I click JS Alerts and click OK")
    public void iClickJSAlertsAndClickOK() throws InterruptedException {
        BaseTest.javaScriptAlertsPage.clickJSAlert();
    }

    //JS Prompts enter text and click OK

    @When("I click JS Prompts And I enter text {string} And I click OK")
    public void iClickJSPromptsAndIEnterTextAndIClickOK(String textMsg) throws InterruptedException {

        BaseTest. javaScriptAlertsPage.JSPromptOKBtn(textMsg);
    }

    @Then("I verify that {string} Message is displayed from hidden")
    public void iVerifyThatMessageIsDisplayedFromHidden(String HidRes) throws InterruptedException
    {
        BaseTest.dlpePage.displayHiddenMsg(HidRes);
    }


}






