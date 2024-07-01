package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage {
    WebDriver driver;
    public final By paragraph1 = By.xpath("//p[1]");
    public final By paragraph2 = By.xpath("//p[2]");

    public TyposPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open(){
        driver.get("https://the-internet.herokuapp.com/typos");
    }

    public String getParagraph1Text() {
        return driver.findElement(paragraph1).getText();
    }

    public String getParagraph2Text() {
        return driver.findElement(paragraph2).getText();
    }
}
