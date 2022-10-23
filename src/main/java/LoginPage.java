import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class LoginPage {
    private final SelenideElement emailField = Selenide.$(By.xpath("//input[@name='name']"));
    private final SelenideElement passwordField = Selenide.$(By.xpath("//input[@name='Пароль']"));
    private final SelenideElement entranceButton = Selenide.$(By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']"));

    public LoginPage clickUserEmailField() {
        emailField.click();
        return this;
    }

    public LoginPage clickUserPasswordField() {
        passwordField.click();
        return this;
    }

    public LoginPage clickEntranceButton() {
        entranceButton.click();
        return this;
    }

    public LoginPage setUserEmailField(String userEmail) {

        emailField.sendKeys(userEmail);
        return this;
    }

    public LoginPage setUserPasswordField(String userPassword) {

        passwordField.sendKeys(userPassword);
        return this;
    }

    public String getEntranceButtonText() {
        entranceButton.shouldHave(text("Войти"));
        return entranceButton.getText();
    }


    public boolean isTextEquals(String defaultText, String actualText) {
        return defaultText.equals(actualText);


    }
}