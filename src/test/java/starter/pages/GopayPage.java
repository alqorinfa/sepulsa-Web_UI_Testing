package starter.pages;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
public class GopayPage extends PageObject{
    private By title() {return By.className("gopay-qrcode");}

    @Step
    public boolean validateOnGopayPage() {
        return $(title()).isDisplayed();
    }
}
