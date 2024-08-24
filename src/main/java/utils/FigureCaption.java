package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FigureCaption {

    WebElement caption;

    public FigureCaption(WebElement caption) {
        this.caption = caption;
    }

    private final By username = By.tagName("h5");

    private final By profile = By.tagName("a");

    public String getUsername(){
        return caption.findElement(username).getText();
    }

    public String getProfile(){
        return caption.findElement(profile).getText();
    }
}
