package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class InputPage {
    WebDriver driver;
    public final By inputnumber = By.xpath("//input[@type='number']");

    public InputPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterNumber(Integer number) {
        String value = String.valueOf(number);
        driver.findElement(inputnumber).sendKeys(value);
    }

    public String getText() {
        return driver.findElement(inputnumber).getAttribute("value");
    }

    public void click() {
        driver.findElement(inputnumber).click();
    }

    public void enterKeys(Keys keys) {
        driver.findElement(inputnumber).sendKeys(keys);
    }
}
