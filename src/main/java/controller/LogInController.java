package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInController {
    @FindBy(xpath = "//*[@id='authentication']")
    WebElement signInButton;
    @FindBy(xpath = "//*[@id='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//*[@id='passwd']")
    WebElement inputPassword;
    public LogInController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setSignInButton(){
        signInButton.isDisplayed();
    }
    public void validLogInput(){
        signInButton.click();
        inputEmail.sendKeys("badolusa@yahoo.com");
        inputPassword.sendKeys("12345");

    }
}
