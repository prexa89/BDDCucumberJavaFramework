package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends DriverManager {

    DriverManager driverManager = new DriverManager();

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement button;
    @FindBy(xpath = "//input[@id='Newsletter']")
    WebElement newsLetterRadio;
    @FindBy(id = "FirstName")
    WebElement name;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(id = "Email")
    WebElement mail;
    @FindBy(id = "Password")
    WebElement psw;
    @FindBy(id = "ConfirmPassword")
    WebElement confPass;
    @FindBy(id = "register-button")
    WebElement reButton;
    @FindBy(xpath = "//span[@class='female']")
    WebElement radio;
    @FindBy(xpath = "//span[@class='male']")
    WebElement maleRadio;
    @FindBy(name = "DateOfBirthDay")
    WebElement dob;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dom;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement doy;
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationMsg;
    @FindBy(css = "#Company")
    WebElement companyName;

    public void regButton() {
        button.click();
    }

    public boolean newsLetterCheckBox() {
        newsLetterRadio.click();
        return newsLetterRadio.isSelected();
    }

    public void firstName(String firstname) {
        name.sendKeys(firstname);
    }

    public void lstName(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void myMail(String email) {
        int myRandomNumber = driverManager.generateRandomNumber();
        System.out.println(myRandomNumber + email);
        mail.sendKeys(myRandomNumber + email);
    }

    public void passWord(String password) {
        psw.sendKeys(password);
    }

    public void confirmPasssword(String confirmpassword) {
        confPass.sendKeys(confirmpassword);
    }

    public void registerButton() {
        reButton.click();
    }

    public void setRadio() {
        radio.click();
    }

    public void setMaleRadio() {
        maleRadio.click();
    }

    public void dateOfBirth() {
        dob.sendKeys("9");
    }

    public void dateOfMonth() {
        dom.sendKeys("April");
    }

    public void dateOfYear() {
        doy.sendKeys("2000");
    }

    public String regiMessage() {
        return registrationMsg.getText();
    }

    public void myCompanyName(String myCompanyName) {
        companyName.sendKeys(myCompanyName);
    }
}