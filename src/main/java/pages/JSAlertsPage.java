package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {

    WebDriver driver;

    public JSAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By jsAlertButton = By.xpath("//button[contains(text(),'JS Alert')]");

    private final By result = By.id("result");


    public void clickOnJSAlertButton(){
        driver.findElement(jsAlertButton).click();
    }

    public String getResult (){
        return driver.findElement(result).getText();
    }
    public void acceptAlerts(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlerts(){
        driver.switchTo().alert().dismiss();
    }
}
