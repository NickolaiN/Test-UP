package steps;

import io.qameta.allure.Step;

import static org.testng.Assert.assertEquals;

public class DescSteps {
    @Step("Первое тестирование дискриминанта")
    public void FirstTry(int num) {
        assertEquals(num, 4);
    }

    @Step("Второе тестирование дискриминанта")
    public void SecondTry(int num) {
        assertEquals(num, -12);
    }

    @Step("Третье тестирование дискриминанта")
    public void ThirdTry(int num) {
        assertEquals(num, -119);
    }
}
