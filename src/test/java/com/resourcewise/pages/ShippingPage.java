package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends DriverManager {

    DriverManager driverManager=new DriverManager();
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

}
