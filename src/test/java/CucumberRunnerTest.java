
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import utils.testng.listeners.TestListener;


@Listeners(TestListener.class)
@CucumberOptions(features = {"src/test/resources/"},
        glue={"Test"},
        plugin = { "pretty",
        "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "html:target/cucumber-html-reports",
                "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt"
}

)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}
