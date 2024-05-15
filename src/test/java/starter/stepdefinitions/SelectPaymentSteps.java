package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.pages.PulsaPage;
import starter.pages.PaymentPage;
import starter.pages.GopayPage;

public class SelectPaymentSteps {
    @Steps
    PulsaPage pulsaPage;

    @Steps
    PaymentPage paymentPage;

    @Steps
    GopayPage gopayPage;

    @And("I input valid phone number")
    public void inputValidPhoneNumber() {
        pulsaPage.inputNumber("0895634893288");
    }

    @And("I click a product")
    public void clickProduct() {
        pulsaPage.validateProduct();
        pulsaPage.clickProduct();
    }

    @And("I am on payment page")
    public void onPaymentPage() {
        paymentPage.validateOnPaymentPage();
    }

    @And("I click gopay")
    public void clickGopay() {
        paymentPage.validateGopayIcon();
        paymentPage.clickGopayCheckbox();
    }

    @And("I click bayar sekarang button")
    public void clickPayNowButton() {
        paymentPage.clickPaymentButton();
    }

    @Then("I redirected to Gopay page")
    public void onTheGopayPage() {
        gopayPage.validateOnGopayPage();
    }

}
