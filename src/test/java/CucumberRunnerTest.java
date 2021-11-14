
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"src/test/resources/"},
        glue={"Test"},
        plugin = { "pretty",
//        "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
}

      )
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}
