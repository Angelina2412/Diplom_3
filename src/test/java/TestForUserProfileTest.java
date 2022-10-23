import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class TestForUserProfileTest extends BaseTest{
    private final String url = "https://stellarburgers.nomoreparties.site";
    private final String urlUserCabinet = "https://stellarburgers.nomoreparties.site/account/profile";
    private static final String ENTRANCE_MESSAGE = "Войти";
    private static final String PROFILE_MESSAGE = "Профиль";
    private static final String BUTTONMAKETHEORDER_MESSAGE = "Оформить заказ";

    @Test
    @DisplayName("Check the transitions between user cabinet and constructor")
    public void goToConstructorFromUserCabinet() throws InterruptedException {
        Selenide.open(url);
        MainPage mainPage = new MainPage();
        mainPage.clickUserPageButton();
        UserPage userPage = new UserPage();
        Thread.sleep(5000);
        userPage.clickConstructorButton();
        Thread.sleep(5000);
        assertTrue(mainPage.isTextEquals(BUTTONMAKETHEORDER_MESSAGE, mainPage.getMakeTheOrderButtonText()));
    }
    @Test
    @DisplayName("Check the transitions main page and user page")
    public void goToUserCabinet(){
        MainPage mainPage = new MainPage();
        UserPage userPage = new UserPage();
        mainPage.clickUserPageButton();
        assertTrue(userPage.isTextEquals(PROFILE_MESSAGE, userPage.getProfileButtonText()));
    }
    @Test
    @DisplayName("Check the transitions then put on icon in user page")
    public void goToIconFromUserCabinet() throws InterruptedException {
          Selenide.open(url);
          MainPage mainPage = new MainPage();
          UserPage userPage = new UserPage();
          mainPage.clickUserPageButton();
          Thread.sleep(5000);
          userPage.clickBurgersIcon();
          Thread.sleep(5000);
          assertTrue(mainPage.isTextEquals(BUTTONMAKETHEORDER_MESSAGE, mainPage.getMakeTheOrderButtonText()));
    }
    @Test
    @DisplayName("Check the transitions then put on exit button in user page")
    public void checkTheExitButton() throws InterruptedException {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        mainPage.clickUserPageButton();
        UserPage userPage = new UserPage();
        Thread.sleep(1000);
        userPage.clickExitButton();
        assertTrue(loginPage.isTextEquals(ENTRANCE_MESSAGE, loginPage.getEntranceButtonText()));
    }
}
