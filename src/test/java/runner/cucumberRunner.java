package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/stories",
        glue = "src/main/java/steps" ,
        stepNotifications = true)
public class cucumberRunner {
}
