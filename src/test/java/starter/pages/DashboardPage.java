package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage extends PageObject {

    private By title() {
        return By.id("banner_0");
    }

    private By tagihanPulsa() {
        return By.xpath("//*[@id=\"Pulsa\"]");
    }

    @Step
    public boolean validateOnTheDashboardPage() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title()));
        return titleElement.isDisplayed();
    }

    @Step
    public boolean validatePulsaIcon() {
        return $(tagihanPulsa()).isDisplayed();
    }

    @Step
    public void clickPulsaIcon() {
        $(tagihanPulsa()).click();
    }
}
