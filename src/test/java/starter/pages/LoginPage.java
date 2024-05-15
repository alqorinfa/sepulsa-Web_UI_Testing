package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageObject{
    private By emailField() { return By.id("email"); }

    private By passwordField() { return By.id("password"); }

    private By loginButton() { return By.id("submit_login"); }

    private By errorMessage() { return By.id("alert_description"); }

    @Step
    public boolean validateOnTheLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public boolean getErrorMessage() {
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

}
