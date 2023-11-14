package testFiles;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.CountyResultPage;
import pageobjects.TestBase;

public class CountyResultPageTest extends TestBase {

    CountyResultPage countyResultPage;

    public CountyResultPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        TestBase.initialization();
        countyResultPage = new CountyResultPage();
    }

    @Test(priority = 1)
    public void countyResult() {
        boolean flag = countyResultPage.countyResult();

        Assert.assertTrue(flag);

    }

    @Test(priority = 2)
    public void testCountySearchResultsCount() {
        int count = countyResultPage.countySearchResultsCount();
        Assert.assertTrue(count > 0, "County search results count should be greater than 0");
    }


    @Test(priority = 3)
    public void scrollToSearchResults() {
        countyResultPage = new CountyResultPage();
        countyResultPage.ScrollToSearchResults();

    }
    @Test(priority = 4)
    public void scrollToTop() {
        countyResultPage = new CountyResultPage();
        countyResultPage.ScrollToTop();

    }
    @Test(priority = 5)
    public void scrollToBottom() {
        countyResultPage = new CountyResultPage();
        countyResultPage.scrollToBottom();

    }
    @Test(priority = 6)
    public void applyKeywordFilter() {
        countyResultPage = new CountyResultPage();
        countyResultPage.applyKeywordFilter();
}
}

