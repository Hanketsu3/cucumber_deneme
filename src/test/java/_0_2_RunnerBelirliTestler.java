


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/ContactUs.feature"},

        glue = {"stepDefinition"},

        		 plugin = { "pretty",
			                "html:target/site/cucumber-pretty",
			                "json:C:\\Users\\Egemen\\.jenkins\\workspace\\test2/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
			                "junit:target/cucumber-results.xml" },
        dryRun = false
)


public class _0_2_RunnerBelirliTestler extends AbstractTestNGCucumberTests {
}