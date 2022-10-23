import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;

public class TestOnRegPageTest {
    private final String url = "https://stellarburgers.nomoreparties.site/register";
    private static final String ERROR_MESSAGE = "Некорректный пароль";
    @Test
    @DisplayName("Check the success registration")
    public void successReg(){
        Selenide.open(url);
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickUserNameField();
        registerPage.setUserNameField("Qwertyu");
        registerPage.clickUserEmailField();
        registerPage.setUserEmailField("jsjsj@mail.ru");
        registerPage.clickUserPasswordField();
        registerPage.setUserPasswordField("1234566");
        registerPage.clickRegButton();
    }
    @Test
    @DisplayName("Check the unsuccessful registration")
    public void unsuccessfulReg(){
        Selenide.open(url);
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickUserNameField();
        registerPage.setUserNameField("Qwertyu");
        registerPage.clickUserEmailField();
        registerPage.setUserEmailField("jsjsj@mail.ru");
        registerPage.clickUserPasswordField();
        registerPage.setUserPasswordField("1");
        registerPage.clickRegButton();
        assertTrue(registerPage.isTextEquals(ERROR_MESSAGE, registerPage.getErrorText()));
    }

}

