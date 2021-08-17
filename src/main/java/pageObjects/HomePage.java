package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[@class='nav-line-1-container']")
    WebElement myAccountLink;



    public void clickMyAccountLink() {

        myAccountLink.click();
    }
}
