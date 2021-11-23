package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class RegisterLoginPage extends PageObject {

    //WEB ELEMENT PRE-CONDITION
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")
    WebElement iconBookStore;


    public void clickIconBookStore() {

        iconBookStore.click();
    }

    @FindBy(css = "#login")
    WebElement btnLogin;

    public void clickButtonLogin() {

        btnLogin.click();
    }

    @FindBy(xpath = "//button[@id='newUser']")
    WebElement btnNewUser;

    public void BtnNewUser() {

        btnNewUser.click();
    }

    //WEB ELEMENT DI LOGIN PAGE
    @FindBy(xpath = "//input[@id='userName']")
    WebElement inputFieldUsername;

    public void inputvalidusername() {

        inputFieldUsername.sendKeys("sandowahyu");
    }

    public void inputinvalidusername(String invalidemail) {

        inputFieldUsername.sendKeys(invalidemail);
    }

    @FindBy(xpath = "//input[@id='password']")
    WebElement inputFieldPassword;

    public void inputvalidpassword() {

        inputFieldPassword.sendKeys("Anggay17!");
    }

    public void inputinvalidpassword(String invalidpassword) {

        inputFieldPassword.sendKeys(invalidpassword);
    }

    @FindBy(xpath = "//button[@id='login']")
    WebElement btnLogin2;

    public void clickButtonLogin2() {
        btnLogin2.click();
    }

    @FindBy(xpath = "//label[@id='userName-value']")
    WebElement validateUsername;

    public void validateUsername() {

        Assert.assertEquals("sandowahyu", validateUsername.getText());
    }

    @FindBy(xpath = "//p[@id='name']")
    WebElement validateAlert;

    public void validateAlertInvalidUsernamePassword() {
        Assert.assertEquals("Invalid username or password!", "Invalid username or password!", validateAlert.getText());
    }

    @FindBy(xpath = "//*[@id=\"userName\"]")
    WebElement AlertFieldUsernameEmpty;

    public void validateAlertFieldUsernameEmpty() {

        element(AlertFieldUsernameEmpty).waitUntilVisible();
    }

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement AlertFieldPasswordEmpty;

    public void validateAlertFieldPasswordEmpty() {

        element(AlertFieldPasswordEmpty).waitUntilVisible();
    }

    //WEB ELEMENT DI REGISTER PAGE
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement inputFieldFirstname;

    public void setInputFieldValidFirstname() {

        inputFieldFirstname.sendKeys("Sendu");
    }

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement inputFieldLastname;

    public void setInputFieldvalidLastname() {

        inputFieldLastname.sendKeys("Senja");
    }

    @FindBy(xpath = "//input[@id='userName']")
    WebElement inputFielduserName;

    public void setInputFieldUserName() {

        inputFielduserName.sendKeys("SenduSenja");
    }

    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;

    public void setInputPassword() {

        inputPassword.sendKeys("Anggay17!");
    }

    @FindBy(id = "register")
    WebElement clickButtonRegister;

    public void clickBtnRegister() {
        clickButtonRegister.click();
    }

    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement AlertCaptcha;

    public void validateAlertCaptcha() {
        Assert.assertEquals("Please verify reCaptcha to register!", "Please verify reCaptcha to register!", AlertCaptcha.getText());
    }
}
