package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PulsaPage extends PageObject {
    private By title() {
        return By.xpath("//div[@style='flex-grow: 1']");
    }

    private By numberField() {
        return By.id("phone_number");
    }

    private By product() {
        return By.xpath("//*[@id='Tri Rp1.000']");
    }

    @Step
    public boolean validateOnPulsaPage() {
        return $(title()).isDisplayed();
    }


    @Step
    public void inputNumber(String number) {
        $(numberField()).type(String.valueOf(number));
    }

    @Step
    public void validateProduct() {
        $(product()).isDisplayed();
    }

    @Step
    public void clickProduct() {
        $(product()).click();
    }


}