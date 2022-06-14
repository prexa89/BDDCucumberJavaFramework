package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends DriverManager {
    DriverManager driverManager = new DriverManager();
    @FindBy(css=".ico-login")
    WebElement loginButton;

    @FindBy(linkText = "Privacy notice")
    WebElement privacyText;
    @FindBy(id = "small-searchterms")
    private WebElement searchInputField;
    @FindBy(xpath = "//*[@id=\"ph-topic\"]/div[2]/p")
    WebElement privacyMsg;

    public void clickOnLoginButton(){
        waitUntilElementIsVisible(loginButton,20,"Login Button is not visible");
        loginButton.click();

    } public void scrollToPrivacyText(){
        driverManager.scrollTo(privacyText);
    }

    public void clickOnPrivacyPolicy(){
        privacyText.click();

    }
    public void takeSearchFieldScreenshot() throws IOException {
        takeElementscreenshot(searchInputField, "search");

    }   public String privacyMessege(){
         return privacyMsg.getText();
    }

}
