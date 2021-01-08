package com.co.newchallenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EnterEmail {
    public static final Target TXT_ENTER_EMAIL = Target.the("Enter email field").located(By.id("email_create"));
    public static final Target BTN_SUBMIT_CREATE = Target.the("Create an account button").located(By.id("SubmitCreate"));
    public static final Target DLG_REGISTERED_EMAIL = Target.the("Registered email").locatedBy("//div[@id='create_account_error']/ol/li");
    public static final Target TXT_EMAIL = Target.the("Email log in").located(By.id("email"));
    public static final Target TXT_PASSWORD = Target.the("Password log in").located(By.id("passwd"));
    public static final Target BTN_SIGN_IN = Target.the("Sign in button").located(By.id("SubmitLogin"));
    public static final Target DLG_ERROR_MESSAGE = Target.the("Password is empty").locatedBy("//div[@class='alert alert-danger']//p");
}
