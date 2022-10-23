import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ForgotPasswordPage {
    private final SelenideElement entranceButton = Selenide.$(By.xpath("//a[@class='Auth_link__1fOlj']"));
    public ForgotPasswordPage clickEntranceButton() {
        entranceButton.click();
        return this;
    }
}
