package com.co.newchallenge.stepdefinitions;

import com.co.newchallenge.exceptions.CreationFailed;
import com.co.newchallenge.exceptions.EmailNotRegistered;
import com.co.newchallenge.exceptions.EmailOnly;
import com.co.newchallenge.exceptions.PasswordOnly;
import com.co.newchallenge.models.UserAccount;
import com.co.newchallenge.questions.EmptyPasswordMessage;
import com.co.newchallenge.questions.LoggedInMessage;
import com.co.newchallenge.questions.RegisteredEmailMessage;
import com.co.newchallenge.questions.RequiredFieldsMessage;
import com.co.newchallenge.tasks.CreateAnAccount;
import com.co.newchallenge.tasks.CreateAnAccountWith;
import com.co.newchallenge.tasks.LogInWith;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import java.util.List;

import static com.co.newchallenge.stepdefinitions.Hooks.gabriel;
import static com.co.newchallenge.utils.Constants.*;

public class CreateUserStepDefinitions {

    @When("^he creates an account on the app web$")
    public void heCreatesAnAccountOnTheAppWeb(List<UserAccount> dataUser) {
        gabriel.attemptsTo(CreateAnAccount.withTheData(dataUser));
    }

    //@When("^he enters the email \"([^\"]*)\" but not the password$")
    //public void heEntersTheEmailButNotThePassword(String email) {
      //  gabriel.attemptsTo(LogInWith.theEmail(email));
    //}

    @When("^he enters the registered email (.*)$")
    public void heEntersTheRegisteredEmailQwertyQwertyCom(String email) {
       gabriel.attemptsTo(CreateAnAccountWith.theRegisteredEmail(email));
    }

    @When("^he enters the email but not the password$")
    public void heEntersTheEmailButNotThePassword() {
        gabriel.attemptsTo(LogInWith.theEmail());
    }

    @Then("^he should be able to login to the platform and see the message: (.*)$")
    public void heShouldBeAbleToLoginToThePlatform(String text) {
        gabriel.should(GivenWhenThen.seeThat(LoggedInMessage.text(), Matchers.equalTo(text)).orComplainWith(CreationFailed.class, MESSAGE));
    }

    @Then("^he should see the error message: (.*)$")
    public void heShouldSeeTheErrorMessageThereAreErrors(String text) {
        gabriel.should(GivenWhenThen.seeThat(RequiredFieldsMessage.text(), Matchers.equalTo(text)).orComplainWith(PasswordOnly.class, ERROR_EMPTY_FIELDS));
    }

    @Then("^he should see the dialog message in red: \"([^\"]*)\"$")
    public void heShouldSeeTheDialogMessageInRed(String message) {
        gabriel.should(GivenWhenThen.seeThat(EmptyPasswordMessage.text(), Matchers.equalTo(message)).orComplainWith(EmailOnly.class, ERROR_EMAIL_ONLY));
    }

    @Then("^the system shows him the message: (.*)$")
    public void theSystemShowsHimTheMessageAnAccountUsingThisEmailAddressHasAlreadyBeenRegisteredPleaseEnterAValidPasswordOrRequestANewOne(String text) {
        gabriel.should(GivenWhenThen.seeThat(RegisteredEmailMessage.text(), Matchers.equalTo(text)).orComplainWith(EmailNotRegistered.class, ERROR_REGISTERED_EMAIL));
    }
}
