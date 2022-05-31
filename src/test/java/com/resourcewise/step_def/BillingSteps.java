package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.BillingPage;
import com.resourcewise.pages.ShippingPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.endsWith;
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
}}
