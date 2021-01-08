package com.co.newchallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.newchallenge.userinterfaces.EnterEmail.BTN_SUBMIT_CREATE;
import static com.co.newchallenge.userinterfaces.EnterEmail.TXT_ENTER_EMAIL;
import static com.co.newchallenge.userinterfaces.SignIn.BTN_SIGNIN;

public class CreateAnAccountWith implements Task {
    private String email;

    public CreateAnAccountWith(String email) {
        this.email = email;
    }

    public static CreateAnAccountWith theRegisteredEmail(String email) {
        return Tasks.instrumented(CreateAnAccountWith.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SIGNIN),
                Enter.theValue(email).into(TXT_ENTER_EMAIL),
                Click.on(BTN_SUBMIT_CREATE));
    }
}
