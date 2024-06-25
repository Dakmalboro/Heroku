import org.testng.annotations.Test;
import pages.TyposPage;

import static org.testng.Assert.*;

public class TyposTest extends BaseTest {
    @Test
    public void paragraph1Test() {
        driver.get("https://the-internet.herokuapp.com/typos");
        typosPage = new TyposPage(driver);
        assertEquals(typosPage.getParagraph1().getText(), "This example demonstrates a typo being introduced. It does it randomly on each page load.");
        assertEquals(typosPage.getParagraph2().getText(), "Sometimes you'll see a typo, other times you won't.");
    }
}
