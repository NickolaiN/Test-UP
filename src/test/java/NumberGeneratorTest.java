import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;

@Epic("Четвертая группа тестов")
public class NumberGeneratorTest extends BaseTest{
    @Test(description = "Тестирование генератора автомобильных номеров")
    @Description("Тестирование генератора автомобильных номеров")
    public void testNumber(){
        NUM_GEN_STEPS.haveNumber(CarNumber.carNumberGenerator());
    }
}
