package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginController {
    @FindBy(xpath = "//*[@id='authentication']")
    WebElement signInButton;
    @FindBy(xpath = "//*[@id='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//*[@id='passwd']")
    WebElement inputPassword;
    public InvalidLoginController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setSignInButton(){
        signInButton.isDisplayed();
    }
    public void invalidLogInput(){
        signInButton.click();
        inputEmail.sendKeys("badolusa@yahoo.com");
        inputPassword.sendKeys("12345");



    }

}
