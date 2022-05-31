package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends DriverManager {

    DriverManager driverManager = new DriverManager();
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement button;
    public void regButton(){
        button.click();
    }
    @FindBy(xpath = "//input[@id='Newsletter']")
      WebElement newsLetterRadio;
    public void newsLetterCheckBox() {
        newsLetterRadio.click();
    }
    @FindBy(id = "FirstName")
    WebElement name;
    public void firstName(String firstname){
        name.sendKeys(firstname);
    }
    @FindBy(id = "LastName")
    WebElement lastName;
    public void lstName(String lastname){
        lastName.sendKeys(lastname);
    }
    @FindBy(id = "Email")
    WebElement mail;
    public void myMail(String email) {
        int myRandomNumber = driverManager.generateRandomNumber();
        System.out.println(myRandomNumber + email);
        mail.sendKeys(myRandomNumber + email);
    }

    @FindBy(id = "Password")
    WebElement psw;
    public void passWord(String password) {
        psw.sendKeys(password);
    }
    @FindBy(id = "ConfirmPassword")
    WebElement confPass;
    public void confirmPasssword(String confirmpassword) {
        confPass.sendKeys(confirmpassword);
    }
    @FindBy(id = "register-button")
    WebElement reButton;
    public void registerButton() {
        reButton.click();
    }
    @FindBy(xpath = "//span[@class='female']")
    WebElement radio;
    public void setRadio() {
        radio.click();
    }
    @FindBy(xpath = "//span[@class='male']")
    WebElement maleRadio;
    public void setMaleRadio() {
        maleRadio.click();
    }
    @FindBy(name = "DateOfBirthDay")
    WebElement dob;
    public void dateOfBirth() {
        dob.sendKeys("9");
    }
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dom;
    public void dateOfMonth() {
        dom.sendKeys("April");    }

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement doy;
    public void dateOfYear() {
        doy.sendKeys("2000");
    }
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationMsg;
    public String regiMessage() {
        return registrationMsg.getText();
    }
    @FindBy(css = "#Company")
    WebElement companyName;
    public void myCompanyName(String myCompanyName) {
        companyName.sendKeys(myCompanyName);

    }
}