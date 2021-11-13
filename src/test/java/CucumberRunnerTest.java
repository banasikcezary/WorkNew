
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/"},
        glue={"Test"},
        plugin = { "pretty" }

      )
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}
