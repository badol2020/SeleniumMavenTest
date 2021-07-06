package loginPage;

import base.ScriptBase;
import controller.LoginController;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class InvalidLoginTest extends ScriptBase {
    LoginController loginController;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyInvalidLogin() {
        loginController = new LoginController(driver);
        loginController.invalidSignin("badolusa@yahoo.com", "12345abc");

    }

    @Test
    public void verifyValidLogin() {
        loginController = new LoginController(driver);
        loginController.validSignin("badolusa@gmail.com", "12345");

    }

    //@AfterTest
    //public void closebrowsr() {
     //   driver.close();
     //   driver.quit();
   // }
}
