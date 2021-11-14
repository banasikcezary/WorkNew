
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import utils.testng.listeners.TestListener;


@Listeners(TestListener.class)
@CucumberOptions(features = {"src/test/resources/"},
        glue={"Test"},
        plugin = { "pretty",
//        "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
}

      )
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}
