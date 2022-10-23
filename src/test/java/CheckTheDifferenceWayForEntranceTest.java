import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static junit.framework.Assert.assertTrue;

public class CheckTheDifferenceWayForEntranceTest {
    private static final String PROFILE_MESSAGE = "Профиль";
    private static final String ENTRANCE_MESSAGE = "Войти";
    private final String url = "https://stellarburgers.nomoreparties.site";
    private final String registerUrl = "https://stellarburgers.nomoreparties.site/register";
    private final String forgotPasswordUrl = "https://stellarburgers.nomoreparties.site/forgot-password";

    @BeforeClass
    public static void config(){
        System.setProperty("webdriver.chrome.driver","/Users/angelina/Desktop/Diplom_Angelina_Kalinina_java_10/Diplom_3/yandexdriver");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
    }

    @Test
    @DisplayName("Check the auth use the button on profile page")
    public void authViaTheProfileButton(){
        config();
        Selenide.open(url);
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        UserPage userPage = new UserPage();
        mainPage.clickUserPageButton();
        loginPage.clickUserEmailField();
        loginPage.setUserEmailField("Laguna@gmail.com");
        loginPage.clickUserPasswordField();
        loginPage.setUserPasswordField("1234567");
        loginPage.clickEntranceButton();
        mainPage.clickUserPageButton();
        assertTrue(userPage.isTextEquals(PROFILE_MESSAGE, userPage.getProfileButtonText()));
    }

    @Test
    @DisplayName("Check the auth use the button on main page")
    public void authViaTheComeInButton() {
        config();
        Selenide.open(url);
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        UserPage userPage = new UserPage();
        mainPage.clickComeInButton();
        loginPage.clickUserEmailField();
        loginPage.setUserEmailField("Laguna@gmail.com");
        loginPage.clickUserPasswordField();
        loginPage.setUserPasswordField("1234567");
        loginPage.clickEntranceButton();
        mainPage.clickUserPageButton();
        assertTrue(userPage.isTextEquals(PROFILE_MESSAGE, userPage.getProfileButtonText()));
    }

    @Test
    @DisplayName("Check the auth use the button register page")
    public void authViaEntranceButtonInRegisterPage() {
        config();
        Selenide.open(registerUrl);
        RegisterPage registerPage = new RegisterPage();
        MainPage mainPage = new MainPage();
        UserPage userPage = new UserPage();
        registerPage.clickEntranceButton();
        LoginPage loginPage = new LoginPage();
        loginPage.clickUserEmailField();
        loginPage.setUserEmailField("Laguna@gmail.com");
        loginPage.clickUserPasswordField();
        loginPage.setUserPasswordField("1234567");
        loginPage.clickEntranceButton();
        mainPage.clickUserPageButton();
        assertTrue(userPage.isTextEquals(PROFILE_MESSAGE, userPage.getProfileButtonText()));
    }

    @Test
    @DisplayName("Check the auth use the button on forgot password page")
    public void authViaEntranceButtonInForgotPasswordPage() {
        config();
        Selenide.open(forgotPasswordUrl);
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.clickEntranceButton();
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        UserPage userPage = new UserPage();
        loginPage.clickUserEmailField();
        loginPage.setUserEmailField("Laguna@gmail.com");
        loginPage.clickUserPasswordField();
        loginPage.setUserPasswordField("1234567");
        loginPage.clickEntranceButton();
        mainPage.clickUserPageButton();
        assertTrue(userPage.isTextEquals(PROFILE_MESSAGE, userPage.getProfileButtonText()));
    }

    @After
    public void setUp() {
        UserPage userPage = new UserPage();
        LoginPage loginPage = new LoginPage();
        userPage.clickExitButton();
        assertTrue(loginPage.isTextEquals(ENTRANCE_MESSAGE, loginPage.getEntranceButtonText()));
    }
}

