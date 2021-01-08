package com.co.newchallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.newchallenge.userinterfaces.EnterEmail.BTN_SIGN_IN;
import static com.co.newchallenge.userinterfaces.EnterEmail.TXT_EMAIL;
import static com.co.newchallenge.userinterfaces.SignIn.BTN_SIGNIN;
import static com.co.newchallenge.utils.Constants.EMAIL_DOMAIN;
import static com.co.newchallenge.utils.Utilities.createRandomEmail;

public class LogInWith implements Task {
    //private String email;
    private String email = createRandomEmail()+EMAIL_DOMAIN;;

    /*public LogInWith(String email){
        this.email = email;
    }*/

    public static LogInWith theEmail(){
        return Tasks.instrumented(LogInWith.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SIGNIN),
                Enter.theValue(email).into(TXT_EMAIL),
                Click.on(BTN_SIGN_IN));
    }
}
