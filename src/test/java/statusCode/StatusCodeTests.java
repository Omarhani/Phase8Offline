package statusCode;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StatusCodeTests extends BaseTests {

    @Test
    public void test200(){
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("200")).click();
        String actualResult  =driver.findElement(
                By.xpath(
                        "//p[contains(text(),'This page returned a 200 status code.')]")).getText();
        String expectedResult = "This page returned a 200 status code.";
        assertTrue(actualResult.contains(expectedResult));
    }
}
