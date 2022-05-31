package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageShoppingCart extends DriverManager {
    DriverManager driverManager=new DriverManager();
   // @FindBy(xpath = "//a[@href='/computers'")
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement comp;
    @FindBy(xpath = "//img[@alt='Picture for category Desktops']")
    WebElement desktop;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")
    WebElement lenovoIdea;
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addToCart;
    @FindBy(xpath = "//span[@class='close']")
    WebElement tabClose;
   // @FindBy(className = "//span[@class='cart-label']")
    @FindBy(xpath = "//span[contains(.,'Shopping cart')]")
    WebElement icoCart;
    //@FindBy(xpath = "//a[@class='product-name']")
   // WebElement productName;
    @FindBy(id = "checkout")
    WebElement checkOut;
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement terms;
  //  @FindBy(id = "BillingNewAddress_CountryId")
    //WebElement countryName;
   // @FindBy(id = "BillingNewAddress_City")
    //WebElement cityName;
    //@FindBy(id = "BillingNewAddress1")
   // WebElement address;
   // @FindBy(id = "BillingNewAddress_ZipPostalCode")
 //   WebElement zipPostalCode;
      public void selectComputer(){
          comp.click();
      }public void selectDesktop(){
          desktop.click();
    }public void lenovoP(){
          lenovoIdea.click();
    }public void addToCartButton(){
          addToCart.click();
    }public void tabCloseB(){
          tabClose.click();
    }public void basketButton(){
          icoCart.click();
    }public void termsAndCondition(){
          terms.click();
    }public void checkOutButton(){
          checkOut.click();
    }

}
