package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.BillingPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BillingSteps extends DriverManager {
    DriverManager driverManager=new DriverManager();
    BillingPage billingPage=new BillingPage();

    @Given("^I am on shopping Cart page$")
    public void i_am_on_shopping_Cart_page() throws Throwable {
        driverManager.getMyUrl();

    }@And("^I select Country as \"([^\"]*)\"$")
    public void i_select_country_as(String Country) throws Throwable {
        billingPage.country(Country);
    }@And("^I enter following details$")
    public void i_enter_following_details(DataTable infoTable) throws Throwable {
        List<Map<String, String>> data = infoTable.asMaps(String.class, String.class);
        System.out.println(data);
        billingPage.cityName(data.get(0).get("cityName"));
        billingPage.address_1(data.get(0).get("address_1"));
        billingPage.zipCode(data.get(0).get("zipCode"));
        billingPage.phoneNum(data.get(0).get("phoneNumber"));

    } @Then("^I click on continue button$")
    public void i_click_on_continue_button() throws Throwable {
        billingPage.contiBtn();
    }// @Then("^I am on checkout page$")
   // public void i_am_on_checkout_page() throws Throwable {

    @And("^I select shipping option (\\d+)$")
    public void i_select_shipping_option(int arg1) throws Throwable {
      billingPage.shippingOption_1();

}   @And("^I click on continue$")
    public void i_click_on_continue() throws Throwable {
    billingPage.shippingContinueButton();

}   @And("^I choose (\\d+)nd option for shipping method$")
    public void i_choose_nd_option_for_shipping_method(int arg1) throws Throwable {
        billingPage.shippingOption_1();

    }@And("^I click on shipping method continue$")
    public void i_click_on_shipping_method_continue() throws Throwable {
        billingPage.shippingMethodContinueBtn();
    }@And("^I choose credit card for payment$")
    public void i_choose_credit_card_for_payment() throws Throwable {
        billingPage.paymentMethodOne();
    }@And("^I click on continue btn$")
    public void i_click_on_continue_btn() throws Throwable {
        billingPage.paymentMethodContiBtn();
    }@And("^I enter cardholder name as \"([^\"]*)\" and cardnumber as\"([^\"]*)\"$")
    public void i_enter_cardholder_name_as_and_cardnumber_as(String Namee, String Num) throws Throwable {
        billingPage.cardholderNam(Namee);
        billingPage.cardNum(Num);
    }@And("^I enter card expire month as \"([^\"]*)\" and card expire year as \"([^\"]*)\"$")
    public void i_enter_card_expire_month_as_and_card_expire_year_as(String ExpM, String ExpY) throws Throwable {
        billingPage.cardExpireMonth(ExpM);
        billingPage.cardExpireYear(ExpY);

    }@And("^I enter card code as \"([^\"]*)\"$")
    public void i_enter_card_code_as(String Code) throws Throwable {
        billingPage.codeOfCard(Code);
    }@And("^I click continue for payment info$")
    public void i_click_continue_for_payment_info() throws Throwable {
        billingPage.contiBtnPaymentInfo();
    }@And("^I click on confirm$")
    public void i_click_on_confirm() throws Throwable {
        billingPage.confirmOrderBtn();
    }@And("^I should get order number$")
    public void i_should_get_order_number() throws Throwable {
     String orderNumber  =billingPage.orderNumber();
        System.out.println("My order" + " "+orderNumber);
    }
}
