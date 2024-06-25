package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TyposPage {
    WebDriver driver;
    public final By paragraph1 = By.xpath("//p[1]");
    public final By paragraph2 = By.xpath("//p[2]");

    public TyposPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getParagraph1() {
        return driver.findElement(paragraph1);
    }

    public WebElement getParagraph2() {
        return driver.findElement(paragraph2);
    }
}
