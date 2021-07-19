package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ScriptBase {
    public static WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void beforetest(){
        init();
    }
    public void init() {
        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            System.setProperty("webdriver.safari.noinstall","true");
            driver = new SafariDriver();
        }else if (browser.equalsIgnoreCase("chromeHeadless")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
        }
        driver.get("http://automationpractice.com/index.php");
    //}
    //@AfterTest
      //  public void closeBrowser() {
    // driver.quit();
     //  driver.close();
    }
}
