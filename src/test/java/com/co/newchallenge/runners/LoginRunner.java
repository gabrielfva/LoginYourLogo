package com.co.newchallenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = "com.co.newchallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class LoginRunner {
}
