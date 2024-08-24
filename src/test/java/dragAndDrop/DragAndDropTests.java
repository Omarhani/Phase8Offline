package dragAndDrop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTests {

    @Test
    public void testDragAndDrop(){
        DragAndDropPage dragAndDropPage = homePage.clickOnDragAndDropLink();
        dragAndDropPage.dragAndDrop();
    }
    @Test
    public void testDragAndDrop2(){
        DragAndDropPage dragAndDropPage = homePage.clickOnDragAndDropLink();
        dragAndDropPage.dragAndDrop2();
    }
}
