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
    }@FindBy(css = ".forgot-password")
    WebElement forgotPassword;
    public void forgotPasswordLink(){
        forgotPassword.click();
    }@FindBy(css = "#Email")
    WebElement recoverEmail;
    public void recoverMail(String rmail){
        recoverEmail.sendKeys(rmail);
    }@FindBy(xpath = "//button[@name='send-email']")
    WebElement recoverBtn;
    public void recoverButton(){
        recoverBtn.click();
    }@FindBy(xpath = "//p[@class='content']")
    WebElement instrctionMsg;
    public String instructionMessage(){
         return instrctionMsg.getText();
    }@FindBy(xpath = "//div[@class='page-title']")
     WebElement pageTitle;
    public String pageTitleMsg(){
       return pageTitle.getText();

    }

}
