package com.common.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.common.framework.steps"},
        plugin = { "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "json:target/cucumber-reports/json-files/cucumber.json",
                "html:target/cucumber-reports/cucumber.html" }
)
public class TestBaseRunner extends AbstractTestNGCucumberTests{

}
