package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testExampleOne() {
        var dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        var onePage = dynamicLoadingPage.clickOnExampleOneLink();
        onePage.clickOnStartButton();
        String actualResult = onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult, expectedResult);
    }
}
