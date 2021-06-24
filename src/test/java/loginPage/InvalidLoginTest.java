package loginPage;

import base.ScriptBase;
import controller.LoginController;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidLoginTest extends ScriptBase {
    LoginController loginController;

    @BeforeTest
    public void beforetest() {
        init();
    }
    @Test
    public void verifyInvalidLoginInput(){
        loginController=new LoginController(driver);
        loginController.invalidLogInput();


    }
}
