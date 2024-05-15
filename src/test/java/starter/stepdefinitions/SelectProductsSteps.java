package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.PulsaPage;

public class SelectProductsSteps {
    @Steps
    DashboardPage dashboardPage;

    @Steps
    PulsaPage pulsaPage;

    @And("I am on the dashboard page")
    public void onTheDashboardPage() {
        dashboardPage.validateOnTheDashboardPage();
    }

    @And("I click pulsa icon")
    public void clickPulsa() {
        dashboardPage.validatePulsaIcon();
        dashboardPage.clickPulsaIcon();
    }

    @Then("I redirected to tagihan PDAM page")
    public void onTheTagihanPdam() {
        pulsaPage.validateOnPulsaPage();
    }
}
