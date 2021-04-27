package LogInTest;

import base.ScriptBase;
import controller.LogInController;
import org.testng.annotations.Test;

public class ValidLogInTest extends ScriptBase {
LogInController logInController;
       @Test
        public void verifyLoginInputProperly(){
           logInController = new LogInController(driver);
        logInController.validLogInput();
    }
}
