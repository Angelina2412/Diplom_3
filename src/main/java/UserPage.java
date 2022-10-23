import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class UserPage {
    private final SelenideElement constructorButton = Selenide.$(By.xpath("//p[text()='Конструктор']"));
    private final SelenideElement burgersIcon = Selenide.$(By.xpath("//div[@class='AppHeader_header__logo__2D0X2']"));
    private final SelenideElement exitButton = Selenide.$(By.xpath("//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']"));
    private final SelenideElement profileButton = Selenide.$(By.xpath("//a[@class='Account_link__2ETsJ text text_type_main-medium text_color_inactive Account_link_active__2opc9']"));
    public UserPage clickConstructorButton() {
        constructorButton.click();
        return this;
    }
    public UserPage clickExitButton() {
        exitButton.click();
        return this;
    }
    public UserPage clickBurgersIcon() {
        burgersIcon.click();
        return this;
    }
    public String getProfileButtonText() {

        return profileButton.getText();
    }
    public boolean isTextEquals(String defaultText, String actualText) {
        return defaultText.equals(actualText);

    }

}
