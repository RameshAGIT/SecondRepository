package executor;

import java.io.File;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests; 

@RunWith(Cucumber.class) 
@CucumberOptions(features= {"src/test/java/resources/features/placeAPI.feature"},
					glue={"stepDefinitions"},
					plugin = {"com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber-reports/report.html", "json:test-output/JsonReport/Cucumber-Json.json"},
					monochrome = true
				) 


//public class Runner {
public class Runner extends AbstractTestNGCucumberTests {
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    
   }

}
