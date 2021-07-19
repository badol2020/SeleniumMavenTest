package searchTest;
import base.ScriptBase;
import controller.Search;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ValidProductSearch extends ScriptBase {
    Search search;

    @Test
    public void verifySearchByDress() {
        search = new Search(driver);
        search.searchProduct(driver, "Dress");
    }
    @Test
    public void verifySearchByHat() {
        search = new Search(driver);
        search.searchProduct(driver, "Hat");
    }
    @Test
    public void verifySearchByBlouse() {
        search = new Search(driver);
        search.searchProduct(driver, "Blouse");
    }
    @Test
    public void verifySearchByTShirts(){
        search =new Search(driver);
        search.searchProduct(driver,"T-SHIRTS");

    }
    @Test
    public void verifySearchByPrintedSummerDress() {
        search = new Search(driver);
        search.searchProduct(driver, "Printed Summer Dress");


    }
    @Test
    public void verifySearchByCasualDresses() {
        search = new Search(driver);
        search.searchProduct(driver, "CASUAL DRESSES");

    }
}