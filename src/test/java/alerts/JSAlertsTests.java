package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

import static org.testng.Assert.assertEquals;

public class JSAlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlertLink();
        jsAlertsPage.clickOnJSAlertButton();
        jsAlertsPage.acceptAlerts();
        String actualResult = jsAlertsPage.getResult();
        String expectedResult = "You successfully clicked an alert";
        assertEquals(actualResult, expectedResult);

    }
}
