package com.co.newchallenge.stepdefinitions;

import com.co.newchallenge.exceptions.WrongCredentials;
import com.co.newchallenge.questions.LoggedInMessage;
import com.co.newchallenge.tasks.LogIn;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.co.newchallenge.stepdefinitions.Hooks.gabriel;
import static com.co.newchallenge.utils.Constants.WRONG_CREDENTIALS_MESSAGE;

public class LoginStepDefinitions {

    @When("^he enters the email \"([^\"]*)\" and password$")
    public void heEntersTheEmailAndPassword(String email) {
        gabriel.attemptsTo(LogIn.withTheEmail(email));
    }

    @Then("^he should see the message: \"([^\"]*)\"$")
    public void heShouldSeeTheMessage(String message) {
        gabriel.should(GivenWhenThen.seeThat(LoggedInMessage.text(), Matchers.equalTo(message)).orComplainWith(WrongCredentials.class, WRONG_CREDENTIALS_MESSAGE));
    }
}
