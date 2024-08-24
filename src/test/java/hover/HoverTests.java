package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;
import utils.FigureCaption;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverOverFigure(){
        HoverPage hoverPage = homePage.clickOnHoverLink();
        FigureCaption figureCaption = hoverPage.hoverOverFigure(2);
        System.out.println(figureCaption.getUsername());
        System.out.println(figureCaption.getProfile());
    }
}
