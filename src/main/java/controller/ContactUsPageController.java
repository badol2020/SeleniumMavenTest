package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageController {
    @FindBy(xpath = "//*[@id='contact-link']/a")
    WebElement contactUsButton;
    @FindBy(id = "//*[@id='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//*[@id='id_order']")
    WebElement inputReference;
    @FindBy(xpath = "//*[@id='submitMessage']/span")
    WebElement sendButton;
    @FindBy(id = "message")
    WebElement message;
    public ContactUsPageController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void displayContactUsButton() {
        contactUsButton.click();
    }

    public void contactUsInput() throws InterruptedException{
        Thread.sleep(5000);
        contactUsButton.isDisplayed();
        inputEmail.sendKeys("bangladeshiqa@gmail.com");
        inputReference.sendKeys("12345");
        sendButton.click();
        inputMessage();
    }

    public void attachFile(WebDriver driver) {
        WebElement choseFile;

    }

    public void inputMessage() {
        message.sendKeys("Welcome");


    }

    }




