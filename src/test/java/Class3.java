import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.example.Main;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

@Epic("Третья группа")
public class Class3 {

    @Test(description = "Тест 3")
    @Description("Первый тест третьей группы")
    public void testDesc() {
        step1();
        step2();
        step3();
    }

    @Step("Шаг 1")
    public void step1() {
        assertEquals(Main.desc(7,1,4), -111);
    }

    @Step("Шаг 2")
    public void step2() {
        assertEquals(Main.desc(9,49,9), 2077);
    }

    @Step("Шаг 3")
    public void step3() {
        assertEquals(Main.desc(5,1,9), -179);
    }

}
