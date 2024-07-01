package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CheckboxPage;
import pages.InputPage;
import pages.TyposPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    CheckboxPage checkboxPage;
    InputPage inputPage;
    TyposPage typosPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typosPage = new TyposPage(driver);
        inputPage = new InputPage(driver);
        checkboxPage = new CheckboxPage(driver);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
