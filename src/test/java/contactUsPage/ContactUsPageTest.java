package contactUsPage;

import base.ScriptBase;
import controller.ContactUsPageController;
import org.testng.annotations.Test;

public class ContactUsPageTest extends ScriptBase{
    ContactUsPageController contactUsPageController;


    @Test
    public void verifyContactUs() throws InterruptedException{
        contactUsPageController=new ContactUsPageController(driver);
        contactUsPageController.displayContactUsButton();

    }


}