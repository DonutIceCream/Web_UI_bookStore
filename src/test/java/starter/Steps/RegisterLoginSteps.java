package starter.Steps;

import starter.Pages.RegisterLoginPage;

public class RegisterLoginSteps {

    RegisterLoginPage loginPage;

    public void openHomePage() {
        loginPage.open();
    }

    public void openBookstorePage() {
        loginPage.clickIconBookStore();
    }

    public void openLoginPage() {
        loginPage.clickButtonLogin();
    }

    public void clickBtnNewUser() {
        loginPage.BtnNewUser();
    }

    //LOGIN PAGE
    public void inputvalidusername() {
        loginPage.inputvalidusername();
    }

    public void inputinvalidusername(String invalidemail) {
        loginPage.inputinvalidusername(invalidemail);
    }

    public void inputvalidpassword() {
        loginPage.inputvalidpassword();
    }

    public void inputinvalidpassword(String invalidpassword) {
        loginPage.inputinvalidpassword(invalidpassword);
    }

    public void openDashboard() {
        loginPage.clickButtonLogin2();
    }

    public void validateUsername() {
        loginPage.validateUsername();
    }

    public void validateAlertInvalidUsernamePassword() {
        loginPage.validateAlertInvalidUsernamePassword();
    }

    public void validateAlertFieldUsernameEmpty() {
        loginPage.validateAlertFieldUsernameEmpty();
    }

    public void validateAlertFieldPasswordEmpty() {
        loginPage.validateAlertFieldPasswordEmpty();
    }

    //REGISTER PAGE
    public void inputvalidfirstname() {
        loginPage.setInputFieldValidFirstname();
    }

    public void inputvalidlastname() {
        loginPage.setInputFieldvalidLastname();
    }

    public void inputusername() {
        loginPage.setInputFieldUserName();
    }

    public void inputpassword() {
        loginPage.setInputPassword();
    }

    public void clickBTNRegister() {
        loginPage.clickBtnRegister();
    }

    public void validateAlertCaptcha() {
        loginPage.validateAlertCaptcha();
    }
}
