package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginTest extends TestBase {

    @Given("the user is in home page")
    public void theUserIsInHomePage() {
        homepage.loginClick();
    }

    @When("redirect to login page and add email and password correct")
    public void redirectToLoginPageAndAddEmailAndPasswordCorrect() {
        loginPage.singIn();
    }

    @Then("redirect to my account page")
    public void redirectToMyAccountPage() {
        Assert.assertTrue(accountPage.controlPage());

    }

    //Incorrect Login
    @When("redirect to login page and add email and password incorrect")
    public void redirectToLoginPageAndAddEmailAndPasswordIncorrect() {
        loginPage.loginIncorrect();
    }

    @Then("the login is not successfull")
    public void theLoginIsNotSuccessfull() {
        Assert.assertTrue(loginPage.controlPage());

    }
}
