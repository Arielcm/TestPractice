package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    private String titlepage = "My account - My Store";

    @FindBy(className = "logout")
    WebElement logoutbtn;

    public boolean controlPage() {
        return this.getText().equals(titlepage);
    }
}
