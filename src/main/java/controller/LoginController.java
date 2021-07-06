package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginController {
    @FindBy(xpath = "//*[@id='header']//a[@class='login']")
    WebElement signInButton;
    @FindBy(id = "email")
    WebElement emailSendKey;
    @FindBy(id = "passwd")
    WebElement passwordSendKey;
    @FindBy(css = "#SubmitLogin >span")
    WebElement SignInSubmitButton;


    public LoginController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void invalidSignin(String email, String Pass){
        signInButton.click();
       emailSendKey.sendKeys(email);
        passwordSendKey.sendKeys(Pass);
        SignInSubmitButton.click();

    }

        public void validSignin(String email, String Pass) {
        signInButton.click();
        emailSendKey.sendKeys(email);
        passwordSendKey.sendKeys(Pass);
        SignInSubmitButton.click();


    }

    }

