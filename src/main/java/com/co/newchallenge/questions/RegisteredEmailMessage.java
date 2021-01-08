package com.co.newchallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.newchallenge.userinterfaces.EnterEmail.DLG_REGISTERED_EMAIL;

public class RegisteredEmailMessage implements Question<String> {

    public static RegisteredEmailMessage text(){
        return new RegisteredEmailMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DLG_REGISTERED_EMAIL).viewedBy(actor).asString();
    }
}
