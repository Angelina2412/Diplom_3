import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import junit.framework.Assert;
import org.junit.Test;

public class TransitionsBetweenSectionsInConstructorTest {
    private final String url = "https://stellarburgers.nomoreparties.site";
    private final String SAUCE_MESSAGE = "Соусы";
    private final String STUFFING_MESSAGE = "Начинки";
    private final String BUN_MESSAGE = "Булки";
    @Test
    @DisplayName("Check the transitions between section on main page")
    public void correctTransitionsBetweenSectionsI() throws InterruptedException {
        Selenide.open(url);
        MainPage mainPage = new MainPage();
        mainPage.clickSauceButton();
        Thread.sleep(5000);
        Assert.assertTrue(mainPage.isTextEquals(SAUCE_MESSAGE, mainPage.getSauceText()));
        mainPage.clickStuffingButton();
        Thread.sleep(1000);
        Assert.assertTrue(mainPage.isTextEquals(STUFFING_MESSAGE, mainPage.getStuffingText()));
        mainPage.clickBunButton();
        Thread.sleep(1000);
        Assert.assertTrue(mainPage.isTextEquals(BUN_MESSAGE, mainPage.getBunText()));
    }
}
