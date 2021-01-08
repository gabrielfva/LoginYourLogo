package com.co.newchallenge.tasks;

import com.co.newchallenge.models.UserAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.co.newchallenge.userinterfaces.EnterEmail.BTN_SUBMIT_CREATE;
import static com.co.newchallenge.userinterfaces.EnterEmail.TXT_ENTER_EMAIL;
import static com.co.newchallenge.userinterfaces.Register.*;
import static com.co.newchallenge.userinterfaces.SignIn.BTN_SIGNIN;
import static com.co.newchallenge.utils.Constants.EMAIL_DOMAIN;
import static com.co.newchallenge.utils.Constants.PASSWORD;
import static com.co.newchallenge.utils.Utilities.createRandomEmail;

public class CreateAnAccount implements Task {

    private String email = createRandomEmail()+EMAIL_DOMAIN;
    private List<UserAccount> data;

    public CreateAnAccount(List<UserAccount> data) {
        this.data = data;
    }

    public static CreateAnAccount withTheData(List<UserAccount> data) {
        return new CreateAnAccount(data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SIGNIN),
                Enter.theValue(email).into(TXT_ENTER_EMAIL),
                Click.on(BTN_SUBMIT_CREATE),
                Click.on(RBT_TITTLE),
                Enter.theValue(data.get(0).getFirstNamePersonalInfo()).into(TXT_FIRST_NAME),
                Enter.theValue(data.get(0).getLastNamePersonalInfo()).into(TXT_LAST_NAME),
                Enter.theValue(PASSWORD).into(TXT_PASSWORD),
                Click.on(CHK_OFFERS),
                Enter.theValue(data.get(0).getCompanyName()).into(TXT_COMPANY),
                Enter.theValue(data.get(0).getAddress()).into(TXT_COMPANY_ADDRESS),
                Enter.theValue(data.get(0).getCity()).into(TXT_CITY),
                Click.on(BTN_STATE),
                Click.on(LST_SELECT_STATE),
                Enter.theValue(data.get(0).getZip()).into(TXT_POST_CODE),
                Click.on(BTN_COUNTRY),
                Click.on(LST_SELECT_COUNTRY),
                Enter.theValue(data.get(0).getAddInfo()).into(TXT_ADD_INFO),
                Enter.theValue(data.get(0).getHomePhone()).into(TXT_PHONE_NUMBER),
                Enter.theValue(data.get(0).getMobilePhone()).into(TXT_MOBILE_NUMBER),
                Enter.theValue(data.get(0).getAliasAddress()).into(TXT_ALIAS_ADDRESS),
                Click.on(BTN_SUBMIT_ACCOUNT));
    }
}
