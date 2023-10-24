package Steps;

import io.qameta.allure.Step;

import static org.testng.Assert.assertTrue;

public class PassSteps {
    @Step("Валидация длины пароля")
    public void lengthTest(String password) {
        assertTrue(password.length() > 8);
    }

    @Step("Тест на наличие чисел в пароле")
    public void digitTest(String password) {
        assertTrue(password.chars().anyMatch(Character::isDigit));
    }

    @Step("Тест на наличие специальных симолов в пароле")
    public void specTest(String password) {
        assertTrue(password.matches(".*[!@#$%^&*()\\-+=<>?].*"));
    }
}
