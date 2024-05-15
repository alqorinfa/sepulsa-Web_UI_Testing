package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.DashboardPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashboardPage;

    @Given("I am on the login page")
    public void onLoginPage() {
        loginPage.openUrl("https://www.sepulsa.com/signin");
        loginPage.validateOnTheLoginPage();
    }

    @When("I input valid email")
    public void inputValidEmail() {
        loginPage.inputEmail("gonomi3464@eryod.com");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("test000@");
    }

    @Then("I redirected to the dashboard page")
    public void onDashboardPage() {
        dashboardPage.validateOnTheDashboardPage();
    }

    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("test000");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I get error message {string}")
    public void getErrorMessage(String message) {
        loginPage.getErrorMessage();
        loginPage.validateEqualErrorMessage(message);
    }
}
