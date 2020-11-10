import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = {"C:\\Rumana\\TESTINGCOURSE\\HargreavesLandsdown\\HLJunitTesting\\src\\test\\Features\\JavaScriptAlerts.feature"},
       // glue = {"stepDefinitions"},
        //dryRun = false,
        plugin = {"pretty", "html:Report"},
        tags = {"@JSconfirmCancel"}
        //tags = {"@JSconfirmOK"}
        //tags = {"@JSconfirmCancel"}
)      //tags = {"@JSAlertsOK"}

@RunWith(Cucumber.class)
public class TestRunner
{

}
