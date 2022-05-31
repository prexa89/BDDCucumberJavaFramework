package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends DriverManager {
    DriverManager driverManager=new DriverManager();
    @FindBy(className = "ico-cart")
    WebElement icoCart;
    @FindBy(xpath = "//a[@class='product-name']")
    WebElement productName;
    @FindBy(id = "checkout")
    WebElement checkOut;
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement terms;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryName;
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityName;
    @FindBy(id = "BillingNewAddress1")
    WebElement address;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
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
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @FindBy(xpath = "//button[@onclick='PaymentInfo.save()'")
    WebElement continueButtonPaymentInfo;
    @FindBy(xpath = "//button[@onclick='ConfirmOrder.save()")
    WebElement confirmOrderButton;


}
