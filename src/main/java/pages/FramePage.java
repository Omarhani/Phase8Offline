package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    private final String frame = "singleframe";

    private final By textArea = By.cssSelector("input[type='text']");

    private void switchToFrame() {
        driver.switchTo().frame(frame);
    }

    private void switchToParent() {
        driver.switchTo().parentFrame();
    }
    public void insertText(String text){
        switchToFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToParent();

    }
}
