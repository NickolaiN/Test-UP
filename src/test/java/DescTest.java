import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.*;

@Epic("Первая группа тестов")
public class DescTest extends BaseTest{

    @Test(description = "Тестирование дискриминанта")
    @Description("Тестирование дискриминанта")
    public void testDesc() {
        DESC_STEPS.FirstTry(Desc.desc(1 , -8, 15));
        DESC_STEPS.SecondTry(Desc.desc(2, 2, 2));
        DESC_STEPS.ThirdTry(Desc.desc(4,3,8));
    }
}