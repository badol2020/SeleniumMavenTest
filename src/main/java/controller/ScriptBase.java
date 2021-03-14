package controller;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ScriptBase {

    public WebDriver driver;

    @Test
        public void init() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();
    }
    @Test
        public void init1() {
        driver = new SafariDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();
    }

    @Test
        public void init2() {
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();
    }
    @Test
        public void init3() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();
}
}