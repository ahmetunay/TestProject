package com.tunay.gg.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        format = {"json:target/cucumber.json"},
        glue = "com.tunay.gg.tests")
public class CucumberRunner {
}


