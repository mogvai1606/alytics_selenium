package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends BasePage{


    private final By backAlyticsPromo = By.xpath("//a[@href]//span");
    private final By registrationPlus = By.xpath("//div[@class='userNav']//img");
    private final By resetPasswordLink = By.xpath("//a[@class='resetPasswordLink']");
    private final By rememberMeButton = By.id("check2");
    private final By passwordField = By.name("password");

    @FindBy(name = "login")
    private WebElement loginField;

    public LoginPage()
    {
        super();
    }

    // Проверка элемента "Вернуться на промо сайт"
    public void backAlyticsPromoIcon() throws InterruptedException {
        WebElement backAlyticsPromoElement = driver.findElement(backAlyticsPromo);
        assertThat(backAlyticsPromoElement.getText()).as("Кнопка назад на промом сайт не найдена!").isEqualTo("Вернуться на промо сайт");
        assertThat(backAlyticsPromoElement.isEnabled()).as("Кнопка назад на промо сайт не активна").isTrue();
    }

    // Проверка элемента "Зарегистрироваться" +
    public void registrationPlusIcon(){
        WebElement registrationPlusElement = driver.findElement(registrationPlus);
        assertThat(registrationPlusElement.isEnabled()).as("Кнопка регистрации не активна").isTrue();
        assertThat(registrationPlusElement.getAttribute("src")).as("Нет кнопки Зарегистрироваться +").contains("register");
    }

    // Находим и проверяем чекбокс "Запомнить меня"
    public void rememberMeButton(){
        WebElement rememberMeButtonElement = driver.findElement(rememberMeButton);
        // Проверяем, что чекбокс есть на странице и он не выбран по-умолчанию
        assertThat(rememberMeButtonElement.isEnabled()).as("Чекбокс не активен").isTrue();
        assertThat(rememberMeButtonElement.isSelected()).as("Чекбокс активен").isFalse();
        // Активируем чекбокс
        rememberMeButtonElement.click();
        // Проверяем, что чекбокс выбран после клика
        assertThat(rememberMeButtonElement.isSelected()).as("Чекбокс не выбрался").isTrue();
    }

    // Проверка элемента "Забыли пароль"
    public void resetPasswordLink(){
        WebElement resetPasswordLinkElement = driver.findElement(resetPasswordLink);
        assertThat(resetPasswordLinkElement.isEnabled()).as("Ссылка 'Забыли пароль' не активна").isTrue();
        assertThat(resetPasswordLinkElement.getText()).as("Нет кнопки 'Забыли пароль'").isEqualTo("Забыли пароль?");
    }

    // Находим поле Логин
    public void fillLoginFields(String login){
        // Чистим поле ввода логина
        loginField.clear();
        // Кликаем в поле логин
        loginField.click();
        // Вводим логин пользователя
        loginField.sendKeys(login);
    }

    // Находим поле Пароль
    public void fillPasswordFields(String login){
        WebElement passFieldElement = driver.findElement(passwordField);
        // Чистим поле ввода пароля
        passFieldElement.clear();
        // Кликаем на поле ввода пароля
        passFieldElement.click();
        // Вводим пароль пользователя
        passFieldElement.sendKeys(login);
    }

    // Кликаем на Enter, для логина
    public void pressEnter(){
        loginField.click();
        loginField.sendKeys(Keys.RETURN);
    }


}
