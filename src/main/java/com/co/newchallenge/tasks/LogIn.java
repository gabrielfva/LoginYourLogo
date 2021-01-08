package com.co.newchallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.newchallenge.userinterfaces.EnterEmail.*;
import static com.co.newchallenge.userinterfaces.SignIn.BTN_SIGNIN;
import static com.co.newchallenge.utils.Constants.PASSWORD;

public class LogIn implements Task {

    private String email;

    public LogIn(String email){
        this.email = email;
    }

    public static LogIn withTheEmail(String email){
        return Tasks.instrumented(LogIn.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SIGNIN),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(PASSWORD).into(TXT_PASSWORD),
                Click.on(BTN_SIGN_IN));
    }
}
