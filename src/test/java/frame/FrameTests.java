package frame;

import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramePage;

public class FrameTests extends BaseTests {

    FramePage framePage;

    @BeforeMethod
    public void goHome(){
        driver.get("https://demo.automationtesting.in/Frames.html");
        framePage = new FramePage(driver);

    }

    @Test
    public void testFrame(){
        framePage.insertText("hello");
    }

}
