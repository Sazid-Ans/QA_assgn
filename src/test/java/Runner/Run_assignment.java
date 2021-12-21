package Runner;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(value = Cucumber.class)
@CucumberOptions(plugin ={"pretty","html:target/cucumber-repo.html",
        //plugin = {"pretty", "json:target/cucumber.json","html:target/cucumber-repo","com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-repo.html"},
        //"com.cucumber.listener.ExtentCucumberFormatter:target/target/cucumber-repo.html"},
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"},
        features = "C:\\Users\\Hp\\TCS_QA_ASSIGNMENT\\src\\Assignment_Feature",
        glue = "Assignment_class_steps",
        tags = "@scenario01"
                )
public class Run_assignment {
    /*public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    }*/
}

