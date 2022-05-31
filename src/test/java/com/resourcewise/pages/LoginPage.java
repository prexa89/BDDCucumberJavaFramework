package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(css=".page-title")
    WebElement welcomeSignInText;
    public String getWelcomeMessageOnLoginPage(){
       return welcomeSignInText.getText();

    }@FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Password")
    WebElement password;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement button;
    public void myEmail(String mail){
        email.clear();
        email.sendKeys(mail);

    }public void myPassword(String pass){
        password.clear();
        password.sendKeys(pass);
    }public void clickButton(){
        button.click();

    }@FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutB;
    public boolean logoutButtonDisplayed(){
        return logoutB.isDisplayed();
    }
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutButton;
    public void clickLogout(){
        logoutButton.click();
    }
}
