package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void completeText(WebElement element, String string) {
        element.sendKeys(string);
    }

    protected String getText() {
        return driver.getTitle();
    }

}
