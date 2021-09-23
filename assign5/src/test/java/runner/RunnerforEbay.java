package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.*;
@CucumberOptions(features="src/test/resources/features/ebay.feature",glue= {"stepdefinition"},plugin= {"json:JSONReport/cucumber.json","html:HTMLReports","pretty","junit:unitreports/cucumber.xml"})


public class RunnerforEbay extends AbstractTestNGCucumberTests  {

}





















