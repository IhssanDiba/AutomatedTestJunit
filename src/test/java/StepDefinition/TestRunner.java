package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinition"},
monochrome= true,
plugin = {"pretty","junit:target/report.xml"},
tags = "@smoketest"
)
public class TestRunner {

}

//plugin = {"pretty","html:targets/HtmlReports.html"}
//plugin = {"pretty","json:target/JSONReports.json"}