package Tests.CucumberStart;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ScreenShotMaker;
import utils.testng.listeners.TestListener;

@RunWith(Cucumber.class)
@Listeners(TestListener.class)
@CucumberOptions(features = {"src/test/resources"},
        plugin = { "pretty" },
        glue={"classpath:Tests"}
      )
public class CucumberRunnerTest {
      @Test
public void test(){}
}
