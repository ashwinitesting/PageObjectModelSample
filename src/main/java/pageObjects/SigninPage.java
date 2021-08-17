package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    public SigninPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "email")
    WebElement userNameTxtFld;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(name = "password")
    WebElement passwordTxtFld;

    @FindBy(id = "signInSubmit")
    WebElement signinBtn;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/div/span")
    WebElement successMessage;

    @FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
    WebElement invalidUsernameMessage;

    @FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
    WebElement invalidPasswordMessage;

    public void enterUsername(String userNameVal) {
        

        userNameTxtFld.sendKeys(userNameVal);
    }

    public void clickContinueBtn() {
        

        continueBtn.click();
    }

    public void enterPassword(String passwordVal) {
        

        passwordTxtFld.sendKeys(passwordVal);
    }

    public void clickSigninBtnBtn() {
        

        signinBtn.click();
    }

    public void findSuccessMessage(String message)
    {
        String actMessage = successMessage.getText();
        Assert.assertEquals(message,actMessage);

    }

    public void findInvalidUserMessage(String message)
    {

        String actMessage = invalidUsernameMessage.getText();
        Assert.assertEquals(message,actMessage);

    }
    public void findInvalidPasswordMessage(String message)
    {

        String actMessage = invalidPasswordMessage.getText();
        Assert.assertEquals(message,actMessage);

    }


}
