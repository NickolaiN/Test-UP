import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.example.Main;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

@Epic("Вторая группа")
public class Class2 {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Подготовка к тестам");
    }

    @Test(description = "Тест 2")
    @Description("Первый тест второй группы")
    public void testDesc() {
        step1();
        step2();
        step3();
    }

    @Step("Шаг 1")
    public void step1() {
        assertEquals(Main.desc(1,-8,15), 4);
    }

    @Step("Шаг 2")
    public void step2() {
        assertEquals(Main.desc(2,2,2), -12);
    }

    @Step("Шаг 3")
    public void step3() {
        assertEquals(Main.desc(4,3,8), -119);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Завершение тестов");
    }

}



