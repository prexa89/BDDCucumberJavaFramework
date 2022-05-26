package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends DriverManager {
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement button;
    public void regButton() {
        button.click();

    }    @FindBy(id = "FirstName")
        WebElement name;
    public void firstName(String firstname){
        name.sendKeys(firstname);
    }@FindBy(id="LastName")
    WebElement lastName;
    public void lstName(String lastname){
        lastName.sendKeys(lastname);
    }@FindBy(id = "Email")
    WebElement mail;
    public void myMail(String email){
        mail.sendKeys(email);
    }@FindBy(id = "Password")
    WebElement psw;
    public void passWord(String password){
        psw.sendKeys(password);
    }@FindBy(id = "ConfirmPassword")
    WebElement confPass;
    public void confirmPasssword(String confirmpassword){
        confPass.sendKeys(confirmpassword);
    }@FindBy(id = "register-button")
      WebElement reButton;
    public void registerButton(){
        reButton.click();
    }
}
