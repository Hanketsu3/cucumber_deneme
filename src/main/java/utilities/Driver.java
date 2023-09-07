package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Driver {
private static WebDriver driver;

public static WebDriver getDriver() {
	
	if(driver ==null) {
		System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
		driver = new EdgeDriver();
	}
	
	return driver;
}

public static WebDriver getDriver(String headless) {
	
	if(driver ==null) {
		System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        driver = new EdgeDriver(options);
	}
	
	return driver;
	
}

public static void closeDriver() {
	if(driver!=null) {
		driver.quit();
		driver=null;
	}
	
}

}
