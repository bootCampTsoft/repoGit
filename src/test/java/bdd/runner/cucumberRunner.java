package bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/bdd/stories",
        glue = "bdd/steps",
        stepNotifications = true)
public class cucumberRunner {
}
