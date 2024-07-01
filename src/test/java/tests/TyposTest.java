package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TyposTest extends BaseTest {
    @Test
    public void paragraph1Test() {
        typosPage.open();
        assertEquals(typosPage.getParagraph1Text(), "This example demonstrates a typo being introduced. It does it randomly on each page load.");

    }
    @Test
    public void paragraph2Test() {
        typosPage.open();
        assertEquals(typosPage.getParagraph2Text(), "Sometimes you'll see a typo, other times you won't.");
    }
}
