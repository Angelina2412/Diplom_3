import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class MainPage {

    private final SelenideElement userPageButton = Selenide.$(By.linkText("Личный Кабинет"));
    private final SelenideElement comeInButton = Selenide.$(By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']"));
    private final SelenideElement sauceButton = Selenide.$(By.xpath("//span[@class='text text_type_main-default' and text()='Соусы']/parent::div"));
    private final SelenideElement stuffingButton = Selenide.$(By.xpath("//span[@class='text text_type_main-default' and text()='Начинки']/parent::div"));
    private final SelenideElement bunButton = Selenide.$(By.xpath("//span[@class='text text_type_main-default' and text()='Булки']/parent::div"));
    private final SelenideElement spicySauce = Selenide.$(By.xpath("//a[@class='BurgerIngredient_ingredient__1TVf6 ml-4 mr-4 mb-8'][3]"));
    private final SelenideElement messageStuffing = Selenide.$(By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Начинки']"));

    private final SelenideElement messageSauce = Selenide.$(By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Соусы']"));

    private final SelenideElement messageBun = Selenide.$(By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Булки']"));
    private final SelenideElement crossButton = Selenide.$(By.xpath("//button[@class='Modal_modal__close_modified__3V5XS Modal_modal__close__TnseK'"));
    private final SelenideElement makeTheOrderButton = Selenide.$(By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg' and text() = 'Оформить заказ']"));

    public MainPage clickUserPageButton() {
        userPageButton.click();
        return this;
    }

    public MainPage clickCrossButton() {
        crossButton.click();
        return this;
    }

    public MainPage clickComeInButton() {
        comeInButton.click();
        return this;
    }

    public MainPage clickMakeTheOrderButton() {
        makeTheOrderButton.click();
        return this;
    }


    public String getEntranceText() {

        return comeInButton.getText();
    }

    public String getMakeTheOrderButtonText() {
        return makeTheOrderButton.getText();
    }

    public boolean isTextEquals(String defaultText, String actualText) {
        return defaultText.equals(actualText);

    }

    public MainPage clickSauceButton() {
        sauceButton.click();
      //  sauceButton.shouldBe(Condition.selected);
        return this;
    }

//    public boolean isSelected() {
//        sauceButton.shouldBe(Condition.selected);
////        String attribute = sauceButton.getAttribute("pointer-events");
////        if (attribute == null) {
////            return false;
////        } else return attribute.equals("none");
//    }

    public MainPage clickStuffingButton() {
        stuffingButton.click();
        return this;
    }

    public MainPage clickBunButton() {
        bunButton.click();
        return this;
    }

    public MainPage clickSpicySauce() {
        spicySauce.click();
        return this;
    }
    public String getStuffingText() {
        return messageStuffing.getText();
    }
    public String getSauceText() {
        return messageSauce.getText();
    }
    public String getBunText() {
        return messageBun.getText();
    }

}
