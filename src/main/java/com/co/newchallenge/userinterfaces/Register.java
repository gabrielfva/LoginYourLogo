package com.co.newchallenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Register {
    public static final Target RBT_TITTLE = Target.the("Tittle").located(By.id("id_gender1"));
    public static final Target TXT_FIRST_NAME = Target.the("First name field").located(By.id("customer_firstname"));
    public static final Target TXT_LAST_NAME = Target.the("Last name field").located(By.id("customer_lastname"));
    public static final Target TXT_PASSWORD = Target.the("Password").located(By.id("passwd"));
    public static final Target CHK_OFFERS = Target.the("Special offers").located(By.id("optin"));
    public static final Target TXT_COMPANY = Target.the("Company").located(By.id("company"));
    public static final Target TXT_COMPANY_ADDRESS = Target.the("Address").located(By.id("address1"));
    public static final Target TXT_CITY = Target.the("City").located(By.id("city"));
    public static final Target BTN_STATE = Target.the("State selector").located(By.id("id_state"));
    public static final Target LST_SELECT_STATE = Target.the("Select state").locatedBy("//option[contains(text(),'Hawaii')]");
    public static final Target TXT_POST_CODE = Target.the("Post code").located(By.id("postcode"));
    public static final Target BTN_COUNTRY = Target.the("Country").located(By.id("id_country"));
    public static final Target LST_SELECT_COUNTRY = Target.the("Select country").locatedBy("//option[contains(text(),'United States')]");
    public static final Target TXT_ADD_INFO = Target.the("Additional information").located(By.id("other"));
    public static final Target TXT_PHONE_NUMBER = Target.the("Home phone").located(By.id("phone"));
    public static final Target TXT_MOBILE_NUMBER = Target.the("Mobile number").located(By.id("phone_mobile"));
    public static final Target TXT_ALIAS_ADDRESS = Target.the("Alias address").located(By.id("alias"));
    public static final Target BTN_SUBMIT_ACCOUNT = Target.the("Submit account").located(By.id("submitAccount"));
    public static final Target DLG_REQUIRED_FIELDS = Target.the("Required fields message").locatedBy("//*[@id='center_column']//p");
}
