package com.co.newchallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.newchallenge.userinterfaces.Register.DLG_REQUIRED_FIELDS;

public class RequiredFieldsMessage implements Question<String> {

    public static RequiredFieldsMessage text(){
        return new RequiredFieldsMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DLG_REQUIRED_FIELDS).viewedBy(actor).asString();
    }
}
