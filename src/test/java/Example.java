import org.example.Main;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class Example {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Операции перед выполнением теста.");
    }

    @Test(description = "Проверка функции дискриминанта в три шага.")
    public void testDesc() {
        step1();
        step2();
        step3();
    }

    public void step1() {
        assertNotEquals(Main.desc(5,8,1), 5);
    }

    public void step2() {
        assertEquals(Main.desc(2,2,2), -12);
    }

    public void step3() {
        assertEquals(Main.desc(4,3,8), -119);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Операции после выполнения теста.");
    }

}
