package testFiles;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.TestBase;


public class HomePageTest extends TestBase {

    HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        TestBase.initialization();
        homePage = new HomePage();
    }


    @Test(priority = 1)
    public void homePageTitleTest() {
        String title = homePage.validateHomePageTitle();
        Assert.assertEquals(title, "Search Ireland's No. 1 Property Website | Daft.ie");
    }

    @Test(priority = 2)
    public void provideConsentClickTest() {

        homePage.provideConsentClick();
    }

    @Test(priority = 3)
    public void enterSearchLocation() {

        homePage.enterSearchLocation("Dublin(County)");

    }

    @Test(priority = 4)
    public void islistBoxDisplayed() {
        boolean flag = homePage.islistBoxDisplayed();

        Assert.assertTrue(flag);

    }

    @Test(priority = 5)
    public void listBoxClick() {

        homePage.listBoxClick();
    }
}

