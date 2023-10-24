import io.qameta.allure.Epic;
import jdk.jfr.Description;
import org.testng.annotations.Test;

@Epic("Вторая группа тестов")
public class PassTest extends BaseTest{

    @Test(description = "Тестирование генератора паролей")
    @Description("Тестирование генератора паролей")
    public void testDesc() {
        PASS_STEPS.lengthTest(password);
        PASS_STEPS.digitTest(password);
        PASS_STEPS.specTest(password);
    }

}