package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailtxt;
    @FindBy(id = "passwd")
    WebElement passtxt;
    @FindBy(id = "SubmitLogin")
    WebElement submitbtn;

    private String titlepage = "Login - My Store";

    public void singIn() {
        this.completeText(emailtxt, "practice@practice.com");
        this.completeText(passtxt, "practice");
        this.click(submitbtn);
    }

    public void loginIncorrect() {
        this.completeText(emailtxt, "practice@practice");
        this.completeText(passtxt, "pract");
        this.click(submitbtn);
    }
    public boolean controlPage() {
        return this.getText().equals(titlepage);
    }
}
