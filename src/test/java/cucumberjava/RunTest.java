package cucumberjava;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //glue="/src/test/cucumberjava",
        //features = "/src/resources/cucumberjava",
        features = {"classpath:cucumberjava/CucumberFeature.feature"},
        glue={"cucumberjava"},
        format = {"pretty", "html:target/cucumber"})
public class RunTest {
}
