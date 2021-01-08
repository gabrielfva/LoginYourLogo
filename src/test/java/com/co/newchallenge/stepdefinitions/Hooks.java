package com.co.newchallenge.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed(driver = "chrome")
    public static WebDriver hisBrowser;

    public static Actor gabriel = Actor.named("Gabriel");

    @Before
    public void setUp(){
        gabriel.can(BrowseTheWeb.with(hisBrowser));
    }
}
