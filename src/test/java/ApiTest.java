import io.qameta.allure.Epic;
import org.testng.annotations.Test;

@Epic("Третья группа тестов")
public class ApiTest extends BaseTest{
    @Test(description = "Проверка получения списка пользователей")
    public void testUserList()
    {
        API_STEPS.getUserList();
    }
}