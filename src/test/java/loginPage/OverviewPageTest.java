package loginPage;

import base.ScriptBase;
import com.google.common.annotations.VisibleForTesting;
import controller.OverviewPageController;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OverviewPageTest extends ScriptBase {
    OverviewPageController overviewPageController;


    @Test
    public void verifyOverviewSpecials() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Specials");
    }

    @Test
    public void verifyOverviewNewProducts() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "New products");
    }

    @Test
    public void verifyOverviewBestsellers() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Best sellers");
    }

    @Test
    public void verifyOverviewOurstores() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Our stores");
    }

    @Test
    public void verifyOverviewContactus() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Contact us");
    }

    @Test
    public void verifyOverviewTermsAndConditions() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Terms and conditions of use");
    }

    @Test
    public void verifyOverviewAboutUs() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "About us");
    }

    @Test
    public void verifyOverviewSitemap() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Sitemap");
    }

    @Test
    public void verifyOverviewMyOrders() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "My orders");
    }

    @Test
    public void verifyOverviewMyCreditSlips() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "My credit slips");
    }

    @Test
    public void verifyOverviewMyAddresses() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "My addresses");
    }

    @Test
    public void verifyOverviewMyPersonalInfo() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "My personal info");
    }

    @Test
    public void verifyOverviewWomen() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Women");
    }

    @Test
    public void verifyWomenCatalogueTabDisplay() {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver, "Women");

    }

}