package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +
                    "/resources/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        if (driver == null) {
            String browserName = prop.getProperty("browser");

            if (browserName.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/Users/Ankit Chatterjee/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equals("FF")) {
                System.setProperty("webdriver.gecko.driver", "/Users/Ankit Chatterjee/Downloads/geckodriver-v0.33.0-win64");
                driver = new FirefoxDriver();
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(prop.getProperty("url"));
        }
    }
}
