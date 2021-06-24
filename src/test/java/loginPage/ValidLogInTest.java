package loginPage;

import base.ScriptBase;
import controller.LoginController;
import org.testng.annotations.Test;

public class ValidLogInTest extends ScriptBase{
    LoginController logInController;


    @Test
    public void verifyLoginInputProperly(){
        logInController = new LoginController(driver);
        logInController.setSignInButton();

    }
    @Test
    public void verifyInvalidLogin(){
        logInController=new LoginController(driver);
        logInController.invalidLogInput();
    }

}







