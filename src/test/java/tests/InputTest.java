package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class InputTest extends BaseTest {
    @Test
    public void inputNumberTest() {
        inputPage.open();
        inputPage.enterNumber("15");
        assertEquals("15", inputPage.getInputText());
    }

    @Test
    public void inputKeysTest1() {
        inputPage.open();
        inputPage.enterNumber("15");
        inputPage.enterNumber(Keys.ARROW_UP);
        assertEquals("16", inputPage.getInputText());
    }

    @Test
    public void inputKeysTest2() {
        inputPage.open();
        inputPage.enterNumber("15");
        inputPage.enterNumber(Keys.ARROW_DOWN);
        assertEquals("14", inputPage.getInputText());
    }
}
