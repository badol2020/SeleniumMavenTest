package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OverviewPageController {
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/@")
    WebElement signInButton;
    @FindBy(xpath = "//*@[title='Women']")
    WebElement WomenButton;

    public OverviewPageController(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void overviewPageInfo(WebDriver driver, String information){
       driver.findElement(By.xpath("//a[contains(text(),'"+information+"')]")).isDisplayed();
    }
    public void womenCatalogue(WebDriver driver,String catalogueTab){
        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[@title='"+catalogueTab+"']")),driver);
    }
    public void mouseOver(WebElement element,WebDriver driver){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
    }

    }



