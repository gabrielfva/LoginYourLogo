package com.co.newchallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.newchallenge.userinterfaces.EnterEmail.DLG_ERROR_MESSAGE;

public class EmptyPasswordMessage implements Question<String> {

    public static EmptyPasswordMessage text(){
        return new EmptyPasswordMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DLG_ERROR_MESSAGE).viewedBy(actor).asString();
    }
}
