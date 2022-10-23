import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
public class RegisterPage {
    private final SelenideElement userNameField = Selenide.$(By.xpath("//input[@name='name']"));
   private final SelenideElement userEmailField = Selenide.$(By.xpath("//label[text()='Email']/following-sibling::*"));
    private final SelenideElement userPasswordField = Selenide.$(By.xpath("//input[@type='password']"));
    private final SelenideElement regButton = Selenide.$(By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']"));
    private final SelenideElement errorMessage = Selenide.$(By.xpath("//p[@class='input__error text_type_main-default']"));
    private final SelenideElement entranceButton = Selenide.$(By.xpath("//a[@class='Auth_link__1fOlj']"));

    public RegisterPage setUserNameField(String userName) {

        userNameField.sendKeys(userName);
        return this;
    }
    public RegisterPage setUserEmailField(String userEmail) {

        userEmailField.sendKeys(userEmail);
        return this;
    }
    public RegisterPage setUserPasswordField(String userPassword) {

        userPasswordField.sendKeys(userPassword);
        return this;
    }
    public RegisterPage clickRegButton() {
        regButton.click();
        return this;
    }
    public RegisterPage clickEntranceButton() {
        entranceButton.click();
        return this;
    }
    public RegisterPage clickUserNameField() {
        userNameField.click();
        return this;
    }
    public RegisterPage clickUserEmailField() {
        userEmailField.click();
        return this;
    }
    public RegisterPage clickUserPasswordField() {
        userPasswordField.click();
        return this;
    }

    public String getErrorText() {
        return errorMessage.getText();
    }
    public boolean isTextEquals(String defaultText, String actualText) {
        return defaultText.equals(actualText);

    }


}
