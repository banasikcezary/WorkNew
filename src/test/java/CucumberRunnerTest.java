
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import utils.testng.listeners.TestListener;



@CucumberOptions(features = {"src/test/resources/"},
        glue={"Test"},
        plugin = { "pretty",
//        "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
}

      )
@Listeners(TestListener.class)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}
