package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxPage {
    WebDriver driver;
    public final By checkbox1 = By.xpath("//input[@type='checkbox'][1]");
    public final By checkbox2 = By.xpath("//input[@type='checkbox'][2]");


    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckbox1() {
        driver.findElement(checkbox1).click();
    }

    public void clickCheckbox2() {
        driver.findElement(checkbox2).click();
    }

    public void isCheckboxSelected(boolean flag, By locator) {
        if (flag) {
            assertTrue(driver.findElement(locator).isSelected());
        } else {
            assertFalse(driver.findElement(locator).isSelected());
        }

    }
}
