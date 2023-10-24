import org.testng.annotations.BeforeMethod;
import Steps.Steps;

public class BaseTest implements Steps {
    String password;

    @BeforeMethod
    public void bfM(){
        password = PassGenerator.generateRandomPassword(10);
    }

}