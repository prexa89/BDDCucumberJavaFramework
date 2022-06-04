package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPage extends DriverManager {
    DriverManager driverManager=new DriverManager();
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryName;
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityName;
    @FindBy(xpath ="//input[@id='BillingNewAddress_Address1']")
    //input[@id='BillingNewAddress_Address1']
    WebElement address;
    @FindBy(xpath ="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipPostalCode;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @FindBy(id = "shippingoption_1")
    WebElement shippingOption;
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement shippingMethodContinue;
    @FindBy(id = "paymentmethod_1")
    WebElement paymentMethod;
    @FindBy(xpath = "//button[@onclick='PaymentMethod.save()']")
    WebElement paymentMethodContinue;
    @FindBy(id = "CardholderName")
    WebElement cardholderName;
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @FindBy(id ="ExpireMonth")
    WebElement expireMonth;
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @FindBy(xpath = "//button[@onclick='PaymentInfo.save()']")
    WebElement continueButtonPaymentInfo;
    @FindBy(xpath = "//button[@onclick='ConfirmOrder.save()']")
    WebElement confirmOrderButton;
   // @FindBy(id = "shippingoption_1")
   // WebElement shippingOption1;
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement shippingMethodContinueButton;
    @FindBy(xpath="//div[@class='order-number']")
    WebElement orderNum;
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement confirmationMsg;

    public void country(String Country){
        countryName.sendKeys(Country);

    }public void cityName(String City){
        cityName.sendKeys(City);
    }public void address_1(String Address_1){
        address.sendKeys(Address_1);
    }public void zipCode(String Zipcode){
        zipPostalCode.sendKeys(Zipcode);
    }public void phoneNum(String PhoneNum){
        phoneNumber.sendKeys(PhoneNum);
    }public void contiBtn(){
        continueButton.click();
    }public void shippingOption_1(){
        shippingOption.click();
    }public void shippingContinueButton(){
        shippingMethodContinue.click();
    }//public void shippingOpt(){
       // shippingOption.click();
    public void shippingMethodContinueBtn(){
        shippingMethodContinueButton.click();
    }public void paymentMethodOne(){
        paymentMethod.click();
    }public void paymentMethodContiBtn(){
        paymentMethodContinue.click();
    }public void cardholderNam(String Namee){
        cardholderName.sendKeys(Namee);
    }public void cardNum(String Numb){
        cardNumber.sendKeys(Numb);
    }public void cardExpireMonth(String ExpM){
        expireMonth.sendKeys(ExpM);
    }public void cardExpireYear(String ExpY){
        expireYear.sendKeys(ExpY);
    }public void codeOfCard(String Code){
        cardCode.sendKeys(Code);
    }public void contiBtnPaymentInfo(){
        continueButtonPaymentInfo.click();
    }public void confirmOrderBtn(){
        confirmOrderButton.click();
    }public String orderNumber(){
       return orderNum.getText();
    }public String confirmationMessage(){
        return confirmationMsg.getText();
    }


}
