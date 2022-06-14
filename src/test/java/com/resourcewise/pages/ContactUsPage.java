package com.resourcewise.pages;


import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends DriverManager {
    DriverManager driverManager=new DriverManager();
     @FindBy(xpath = "//a[@href='/contactus']")
     WebElement contact;
    // @FindBy(xpath = "//h1[contains(text(),'Contact Us')")
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[1]/h1" )
    WebElement getContact;
     @FindBy(id = "FullName")
    WebElement nameField;
     @FindBy(id = "Email")
    WebElement emailField;
     @FindBy(id = "Enquiry")
    WebElement enquiryField;
     @FindBy(name = "send-email")
    WebElement sendEmail;
     @FindBy(xpath = ("//div[@class='result']"))
    WebElement confirmationText;
     public void clickContactUs(){
         contact.click();
     }public String getText(){
        return getContact.getText();
    }public void fullName(String fullN){
         nameField.sendKeys("preet");
    }public void fullEmail(String fullEml){
         emailField.sendKeys("admin12@yahoo.com");
    }public void enquiryBox(){
         enquiryField.sendKeys("please cancel my order");
    }public void submitBtn(){
         sendEmail.submit();
    }public String confirmMsg(){
       return confirmationText.getText();
    }



}
