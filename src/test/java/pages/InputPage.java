package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputPage {
    WebDriver driver;
    private By inputNumber = By.xpath("//input[@type='number']");

    public InputPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open(){
        driver.get("https://the-internet.herokuapp.com/inputs");
    }
    public void enterNumber(String number) {
        driver.findElement(inputNumber).sendKeys(number);
    }

    public String getInputText() {
        return driver.findElement(inputNumber).getAttribute("value");
    }
    public void enterNumber(Keys keys) {
        driver.findElement(inputNumber).sendKeys(keys);
    }
}
