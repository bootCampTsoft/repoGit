package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/aut/cucumber/userStories",
        glue = "aut.cucumber.steps" ,
        tags = "@regresion",
        stepNotifications = true)
public class cucumberRunner {
}
