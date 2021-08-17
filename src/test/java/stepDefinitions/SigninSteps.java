package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.SigninPage;



public class SigninSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    SigninPage signinPage = new SigninPage(driver);


    @Given("^I'm on homepage$")
    public void i_m_on_homepage() {
        getHomePageUrl();
    }

    @When("^I click myAccoint Link$")
    public void i_click_myAccoint_Link() {
        homePage.clickMyAccountLink();
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username(String userNameVal) {
        wait(10);
        signinPage.enterUsername(userNameVal);

    }

    @When("^I click Continue button$")
    public void i_click_Continue_button() {

        wait(10);
        signinPage.clickContinueBtn();
    }

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String passwordVal) {
        wait(10);
        signinPage.enterPassword(passwordVal);
    }

    @When("^I click Signin button$")
    public void i_click_Signin_button() {
        wait(10);
        signinPage.clickSigninBtnBtn();

    }

    @Then("^I should Signin$")
    public void i_should_Signin() {
        signinPage.findSuccessMessage("Hello, ashwini");
    }

    @When("^I enter invalid username \"([^\"]*)\"$")
    public void i_enter_invalid_username(String usernameVal) {
        signinPage.enterUsername(usernameVal);

    }

    @Then("^I should not be allowed to Continue$")
    public void i_should_not_be_allowed_to_Continue() {
     signinPage.findInvalidUserMessage("We cannot find an account with that e-mail address");
    }

    @When("^I enter invalidpassword \"([^\"]*)\"$")
    public void i_enter_invalidpassword(String passwordVal) {
        signinPage.enterPassword(passwordVal);
    }

    @Then("^I should not be allowed to Signin$")
    public void i_should_not_be_allowed_to_Signin() {


    signinPage.findInvalidPasswordMessage("Your password is incorrect");
    }


}
