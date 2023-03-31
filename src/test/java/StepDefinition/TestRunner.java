package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinition"},
plugin = {"pretty","junit:target/report.xml"},
tags = "@smoketest"
)
public class TestRunner {

}

//{"pretty","html:targets/HtmlReports.html"}
//{"pretty","json:target/JSONReports.json"}
