package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.RegisterLoginSteps;

public class RegisterLogin {

    @Steps
    RegisterLoginSteps loginSteps;

    //Pre-Condition
    @Given("I am open login page demoqa")
    public void i_am_open_login_page_demoqa() {
        loginSteps.openHomePage();
        loginSteps.openBookstorePage();
        loginSteps.openLoginPage();
    }

    //Login Succes
    @When("I am enter valid username")
    public void i_am_enter_valid_username() {
        loginSteps.inputvalidusername();
    }

    @When("I am enter valid password")
    public void i_am_enter_valid_password() {
        loginSteps.inputvalidpassword();
    }

    @When("I am click button {string}")
    public void i_am_click_button(String string) {
        loginSteps.openDashboard();
    }

    @Then("I am redirected to dashboard")
    public void i_am_redirected_to_dashboard() {
        loginSteps.validateUsername();
    }

    //Login Failed
    @When("I am enter invalid username {string}")
    public void i_am_enter_invalid_username(String invalidemail) {
        loginSteps.inputinvalidusername(invalidemail);
    }

    @When("I am not enter username")
    public void i_am_not_enter_username() {

    }

    @When("I am enter invalid password {string}")
    public void i_am_enter_invalid_password(String invalidpassword) {
        loginSteps.inputinvalidpassword(invalidpassword);
    }

    @When("I am not enter password")
    public void i_am_not_enter_password() {

    }

    @Then("I am failed to login")
    public void i_am_failed_to_login() {

    }

    @Then("show alert message {string}")
    public void show_alert_message(String string) {
        loginSteps.validateAlertInvalidUsernamePassword();
    }

    @Then("show alert message in field username {string}")
    public void show_alert_message_in_field_username(String string) {
        loginSteps.validateAlertFieldUsernameEmpty();
    }

    @Then("show alert message in field password {string}")
    public void show_alert_message_in_field_password(String string) {
        loginSteps.validateAlertFieldPasswordEmpty();
    }

    //REGISTER
    @Given("I am open register page demoqa")
    public void i_am_open_register_page_demoqa() {
        loginSteps.openHomePage();
        loginSteps.openBookstorePage();
        loginSteps.openLoginPage();
        loginSteps.clickBtnNewUser();
    }

    @When("I enter firstname correctly")
    public void i_enter_firstname_correctly() {
        loginSteps.inputvalidfirstname();
    }

    @When("I enter lastname correctly")
    public void i_enter_lastname_correctly() {
        loginSteps.inputvalidlastname();
    }

    @When("I am enter username correctly")
    public void i_am_enter_username_correctly() {
        loginSteps.inputusername();
    }

    @When("I am enter password correctly")
    public void i_am_enter_password_correctly() {
        loginSteps.inputpassword();
    }

    @When("I click button {string}")
    public void i_click_button(String string) {
        loginSteps.clickBTNRegister();
    }

    @Then("I failed to register")
    public void i_failed_to_register() {

    }

    @Then("show alert message please verify reCaptcha")
    public void show_alert_message_please_verify_reCaptcha() {
        loginSteps.validateAlertCaptcha();
    }

}
