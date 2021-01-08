package com.co.newchallenge.stepdefinitions;

import com.co.newchallenge.tasks.OpenTheBrowser;
import cucumber.api.java.en.Given;

import static com.co.newchallenge.stepdefinitions.Hooks.gabriel;


public class CommonDefinitions {

    @Given("^that Gabriel wants to access the platform$")
    public void thatGabrielWantsToAccessThePlatform() {
        gabriel.wasAbleTo(OpenTheBrowser.on());
    }
}
