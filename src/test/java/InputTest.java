import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.CheckboxPage;
import pages.InputPage;

import static org.testng.Assert.*;


public class InputTest extends BaseTest {
    @Test
    public void inputNumberTest() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        inputPage = new InputPage(driver);
        inputPage.click();
        inputPage.enterNumber(15);
        Integer actual = Integer.valueOf(inputPage.getText());
        assertEquals(15, actual);
    }

    @Test
    public void inputKeysTest1() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        inputPage = new InputPage(driver);
        inputPage.click();
        inputPage.enterNumber(15);
        inputPage.enterKeys(Keys.ARROW_UP);
        Integer actual = Integer.valueOf(inputPage.getText());
        assertEquals(16, actual);
    }

    @Test
    public void inputKeysTest2() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        inputPage = new InputPage(driver);
        inputPage.click();
        inputPage.enterNumber(15);
        inputPage.enterKeys(Keys.ARROW_DOWN);
        Integer actual2 = Integer.valueOf(inputPage.getText());
        assertEquals(14, actual2);
    }
}
