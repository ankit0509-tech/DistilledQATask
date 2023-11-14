package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountyResultPage extends TestBase{
    //Page Factory - OR:
    @FindBy(xpath = "//ul[@data-testid='results']/li[@class='SearchPagestyled__Result-v8jvjf-2 iWPGnb']/a[1]")
    public WebElement countySearchResults;



    @FindBy(xpath = "//input[@data-testid='terms-input-text']")
    public WebElement keywordInput;

    @FindBy(css = "button[data-testid='filters-modal-show-results-button']")
    public WebElement showResultsBtn;

    public CountyResultPage() {
        PageFactory.initElements(TestBase.driver, this);
    }


    public boolean countyResult() {
        return countySearchResults.isDisplayed();
    }

    public int countySearchResultsCount() {
        List<WebElement> resultsList = driver.findElements(By.xpath("//ul[@data-testid='results']/li[@class='SearchPagestyled__Result-v8jvjf-2 iWPGnb']/a[1]"));
        return resultsList.size();
    }
    public void ScrollToSearchResults() {

        WebElement element = driver.findElement(By.xpath("//ul[@data-testid='results']/li[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void ScrollToTop() {

        WebElement filterBtn = driver.findElement(By.cssSelector("button[aria-label='Filters']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", filterBtn);
        filterBtn.click();
    }
    public void scrollToBottom() {

        WebElement showResultsBtn = driver.findElement(By.cssSelector("button[data-testid='filters-modal-show-results-button']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js.executeScript("arguments[0].scrollIntoView(true);", showResultsBtn);

    }
    public void applyKeywordFilter(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        keywordInput.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        keywordInput.sendKeys("garage");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        showResultsBtn.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    }




