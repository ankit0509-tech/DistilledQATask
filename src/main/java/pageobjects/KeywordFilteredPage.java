package pageobjects;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static pageobjects.TestBase.driver;

public class KeywordFilteredPage {
    //Page Factory - OR:
    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/ul[1]/li[6]/a[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/h2[1]")
    public WebElement keywordSearchResults;

    public KeywordFilteredPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean keywordFilteredResult() {
        return keywordSearchResults.isDisplayed();
    }


    public void clickOnKeywordResults() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        keywordSearchResults.click();

    }

    public boolean isGaragePresentInAdvert() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        keywordSearchResults.click();
        String sectionText = driver.findElement(By.xpath("//div[@data-testid='description']")).getText();
        return sectionText.toLowerCase().contains("garage");
    }


}