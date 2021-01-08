package com.co.newchallenge.tasks;

import com.co.newchallenge.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

    public static OpenTheBrowser on() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }

    @Override
    @Step("{0} opens the browser on Your Logo Home Page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new HomePage()));
    }
}
