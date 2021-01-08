package com.co.newchallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.newchallenge.userinterfaces.CreatedAccount.MY_ACCOUNT;

public class LoggedInMessage implements Question<String> {

    public static LoggedInMessage text() {
        return new LoggedInMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MY_ACCOUNT).viewedBy(actor).asString();
    }
}
