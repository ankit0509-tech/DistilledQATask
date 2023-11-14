package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends TestBase {
    //Page Factory - OR:
    @FindBy(id = "search-box-input")
    public WebElement searchInputBox;

    @FindBy(id = "didomi-notice-agree-button")
    WebElement agreeBtn;


    @FindBy(xpath = "//div/ul[@id='search-box-menu'and @role='listbox']/li")
    public WebElement listBox;

    public HomePage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    public void navigateToHomepage(String url) throws InterruptedException {
        TestBase.driver.get(url);
        TestBase.driver.manage().window().maximize();
    }
    //Actions:
    public String validateHomePageTitle(){

        return TestBase.driver.getTitle();
    }
    public void provideConsentClick(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        agreeBtn.click();
    }

    public void enterSearchLocation(String location){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInputBox.sendKeys(location);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInputBox.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInputBox.sendKeys(Keys.ARROW_DOWN);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInputBox.sendKeys(Keys.ENTER);



    }   public boolean list() {

        return listBox.isDisplayed();
    }

    public void provideClick(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        listBox.click();
    }
    }











