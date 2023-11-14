package testFiles;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.KeywordFilteredPage;
import pageobjects.TestBase;

import static pageobjects.TestBase.driver;

public class KeywordFilteredPageTest {
    KeywordFilteredPage keywordfilteredpage;

    public KeywordFilteredPageTest() {

        super();
    }

    @BeforeMethod
    public void setUp() {
        TestBase.initialization();
        keywordfilteredpage = new KeywordFilteredPage();
    }

    @Test(priority = 1)
    public void keywordFilteredResult() {
        boolean flag = keywordfilteredpage.keywordFilteredResult();

        Assert.assertTrue(flag);

    }

    @Test(priority = 2)
    public void clickOnKeywordResults() {
        keywordfilteredpage = new KeywordFilteredPage();
        keywordfilteredpage.clickOnKeywordResults();
    }
    @Test(priority = 3)
    public void isGaragePresentInAdvert() {
        boolean flag = keywordfilteredpage.isGaragePresentInAdvert();
        Assert.assertTrue(flag);
        driver.quit();

    }

        }


