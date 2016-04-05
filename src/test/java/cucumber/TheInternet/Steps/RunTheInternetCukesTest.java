package cucumber.TheInternet.Steps;

/**
 * Created by francisco.moreno on 04/04/2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/resources/cucumber/features/TheInternet",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        }
)
public class RunTheInternetCukesTest extends AbstractTestNGCucumberTests {

}