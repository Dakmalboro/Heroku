package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxTest extends BaseTest {

    @Test
    public void checkboxesTest() {
        checkboxPage.open();
        assertFalse(checkboxPage.isCheckbox1Selected());
        checkboxPage.clickCheckbox1();
        assertTrue(checkboxPage.isCheckbox1Selected());

        assertTrue(checkboxPage.isCheckbox2Selected());
        checkboxPage.clickCheckbox2();
        assertFalse(checkboxPage.isCheckbox2Selected());
    }
}
