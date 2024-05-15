package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {
    private By payment() { return By.id("submit_payment"); }

    private By gopay() { return By.id("checkbox Gopay");}

    private By errorMessage() { return By.id("error_select_payment");}

    @Step
    public boolean validateOnPaymentPage() {
        return $(payment()).isDisplayed();
    }

    @Step
    public boolean validateGopayIcon() {
        return $(gopay()).isDisplayed();
    }

    @Step
    public void clickGopayCheckbox() {
        $(gopay()).click();
    }

    @Step
    public void clickPaymentButton() {
        $(payment()).click();
    }

    @Step
    public boolean getPaymentErrorMessage() {
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validatePaymentErrorMessageIsEqual(String message) {
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }







}
