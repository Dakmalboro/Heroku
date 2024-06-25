import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends BaseTest {

    @Test
    public void checkboxesTest() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkboxPage = new CheckboxPage(driver);
        checkboxPage.isCheckboxSelected(false, checkboxPage.checkbox1);
        checkboxPage.clickCheckbox1();
        checkboxPage.isCheckboxSelected(true, checkboxPage.checkbox1);

        checkboxPage.isCheckboxSelected(true, checkboxPage.checkbox2);
        checkboxPage.clickCheckbox2();
        checkboxPage.isCheckboxSelected(false, checkboxPage.checkbox2);
    }
}
