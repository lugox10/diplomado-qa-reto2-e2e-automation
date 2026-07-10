package com.saucedemo.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.actors.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.saucedemo.stepdefinitions",
        plugin = {"pretty"}
)
public class TestRunner {
}