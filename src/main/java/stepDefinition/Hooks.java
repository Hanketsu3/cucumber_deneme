package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Driver;

public class Hooks {

    private WebDriver driver;

    @SuppressWarnings("deprecation")
	@Before
    public void beforeScenario() {
        driver = Driver.getDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            // Ekran görüntüsü al
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failure-screenshot");
        }
        
        // WebDriver'ı kapat
        if (driver != null) {
            Driver.closeDriver();
        }
    }

}
