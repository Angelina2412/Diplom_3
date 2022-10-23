import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseTest {
    private static final String url = "https://stellarburgers.nomoreparties.site";

    public static void config(){
        System.setProperty("webdriver.chrome.driver","/Users/angelina/WEB/yandexdriver");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
    }


    @BeforeClass
    public static void authUser() throws InterruptedException {
       config();
        Selenide.open(url);
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        mainPage.clickUserPageButton();
        loginPage.clickUserEmailField();
        loginPage.setUserEmailField("Laguna@gmail.com");
        loginPage.clickUserPasswordField();
        loginPage.setUserPasswordField("1234567");
        Thread.sleep(5000);
        loginPage.clickEntranceButton();
        Thread.sleep(5000);
    }

}
